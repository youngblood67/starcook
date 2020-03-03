package org.cnam.starcook.sales.controller;

import org.cnam.starcook.sales.builders.SalesObjectBuilder;
import org.cnam.starcook.sales.domain.Article;
import org.cnam.starcook.sales.domain.Commande;
import org.cnam.starcook.sales.dto.commande.CommandeDetailsResponse;
import org.cnam.starcook.sales.dto.commande.CreerCommandeRequest;
import org.cnam.starcook.sales.dto.commande.CreerCommandeResponse;
import org.cnam.starcook.sales.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/commandes")
public class CommandeController {
    @Autowired
    private CommandeService commandeService;

    @GetMapping
    public List<CommandeDetailsResponse> listAllCommandes() {
        List<CommandeDetailsResponse> commandeDetailsResponseList = new ArrayList<CommandeDetailsResponse>();
        List<Commande> commandesList = commandeService.listCommandes();
        for (Commande commande : commandesList) {
            CommandeDetailsResponse commandeDetailsResponse = new CommandeDetailsResponse();
            commandeDetailsResponse.reference = commande.getReference();
            commandeDetailsResponse.idClient = commande.getIdClient();

            for (Article article : commande.getArticles()) {
                commandeDetailsResponse.articles.add(SalesObjectBuilder.modelToDTOArticleDetailsResponse(article));
            }
            commandeDetailsResponse.isPayed = commande.isPaid();
            commandeDetailsResponseList.add(commandeDetailsResponse);
        }
        return commandeDetailsResponseList;
    }

    @GetMapping("/{id}")
    public CommandeDetailsResponse getCommandeById(@PathVariable int id) {
        CommandeDetailsResponse commandeDetailsResponse = new CommandeDetailsResponse();
        Commande commande = commandeService.findCommandeById(id);
        commandeDetailsResponse.reference = commande.getReference();
        commandeDetailsResponse.idClient = commande.getIdClient();
        for (Article article : commande.getArticles()) {
            commandeDetailsResponse.articles.add(SalesObjectBuilder.modelToDTOArticleDetailsResponse(article));
        }
        commandeDetailsResponse.isPayed = commande.isPaid();
        return commandeDetailsResponse;
    }

    @PostMapping
    @ResponseBody
    public CreerCommandeResponse saveArticle(@RequestBody CreerCommandeRequest creerCommandeRequest) {
        Commande commande = commandeService.createCommande(creerCommandeRequest);
        CreerCommandeResponse creerCommandeResponse = new CreerCommandeResponse();
        creerCommandeResponse.id = commande.getId();
        creerCommandeResponse.idClient = commande.getIdClient();
        creerCommandeResponse.reference = commande.getReference();
        for (Article article : commande.getArticles()) {
            creerCommandeResponse.articles.add(SalesObjectBuilder.modelToDTOArticleDetailsResponse(article));
        }
        creerCommandeResponse.isPayed = creerCommandeRequest.isPayed;
        return creerCommandeResponse;
    }


}
