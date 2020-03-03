package org.cnam.starcook.sales.services;

import javafx.util.BuilderFactory;
import org.cnam.starcook.sales.builders.SalesObjectBuilder;
import org.cnam.starcook.sales.domain.Article;
import org.cnam.starcook.sales.domain.Catalog;
import org.cnam.starcook.sales.domain.Commande;
import org.cnam.starcook.sales.dto.article.ArticleToCommandRequest;
import org.cnam.starcook.sales.dto.article.CreerArticleRequest;
import org.cnam.starcook.sales.dto.commande.CreerCommandeRequest;
import org.cnam.starcook.sales.entities.*;
import org.cnam.starcook.sales.repositories.IArticleRepository;
import org.cnam.starcook.sales.repositories.ICatalogRepository;
import org.cnam.starcook.sales.repositories.ICommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommandeService {
    @Autowired
    private ICommandeRepository commandeRepository;
    @Autowired
    private IArticleRepository articleRepository;

    public List<Commande> listCommandes() {
        List<CommandeModel> commandesModelList = commandeRepository.findAll();
        List<Commande> commandesList = new ArrayList<Commande>();
        for (CommandeModel cm : commandesModelList) {
            Commande commande = SalesObjectBuilder.modelToDomainObject(cm);
            commandesList.add(commande);
        }
        return commandesList;
    }

    public Commande findCommandeById(int id) {
        CommandeModel commandeModel = commandeRepository.findById(id);
        return SalesObjectBuilder.modelToDomainObject(commandeModel);
    }

    public Commande createCommande(CreerCommandeRequest creerCommandeRequest) {
        CommandeModel commandeModel= new CommandeModel();
        commandeModel.setIdClient(creerCommandeRequest.idClient);
        commandeModel.setReference("POURTESTER"); //A dev dans metier pour reference.
        commandeModel.setPayed(creerCommandeRequest.isPayed);
        List<ArticleModel> articleModels = new ArrayList<ArticleModel>();
        for(ArticleToCommandRequest articleToCommandRequest : creerCommandeRequest.articles){
            ArticleModel articleModel = articleRepository.findByReference(articleToCommandRequest.reference);
            articleModels.add(articleModel);
        }
        commandeModel.setArticles(articleModels);
        CommandeModel savedCommandeModel = commandeRepository.save(commandeModel);
        Commande commande = SalesObjectBuilder.modelToDomainObject(savedCommandeModel);
        return commande;
    }
}
