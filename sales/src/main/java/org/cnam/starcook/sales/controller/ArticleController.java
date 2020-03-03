package org.cnam.starcook.sales.controller;

import org.cnam.starcook.sales.builders.SalesObjectBuilder;
import org.cnam.starcook.sales.domain.Article;
import org.cnam.starcook.sales.domain.Commande;
import org.cnam.starcook.sales.dto.article.*;
import org.cnam.starcook.sales.dto.commande.CommandeDetailsResponse;
import org.cnam.starcook.sales.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping
    public List<ArticleDetailsResponse> listAllArticles() {
        List<ArticleDetailsResponse> articleDetailsResponseList = new ArrayList<ArticleDetailsResponse>();
        List<Article> articlesList = articleService.listArticles();
        for (Article article : articlesList) {
            ArticleDetailsResponse articleDetailsResponse = new ArticleDetailsResponse();
            articleDetailsResponse.reference = article.getRef();
            articleDetailsResponse.label = article.getLabel();
            articleDetailsResponse.priceTTC = article.getPriceHT() * (1 + article.getCategory().getTaxe().getAmount()); //à déplacer classe métier (service)??
            articleDetailsResponse.categoryLabel = article.getCategory().getLabel();
            articleDetailsResponseList.add(articleDetailsResponse);
        }
        return articleDetailsResponseList;
    }

    @GetMapping("/{id}")
    public ArticleDetailsResponse getArticleById(@PathVariable int id) {
        ArticleDetailsResponse articleDetailsResponse = new ArticleDetailsResponse();
        Article article = articleService.findArticleById(id);
        articleDetailsResponse.reference = article.getRef();
        articleDetailsResponse.label = article.getLabel();
        articleDetailsResponse.priceTTC = article.getPriceHT() * (1 + article.getCategory().getTaxe().getAmount()); //à déplacer classe métier (service)??
        articleDetailsResponse.categoryLabel = article.getCategory().getLabel();
        return articleDetailsResponse;
    }

    @PostMapping
    @ResponseBody
    public CreerArticleResponse saveArticle(@RequestBody CreerArticleRequest creerArticleRequest) {
        Article article = articleService.createArticle(creerArticleRequest);
        CreerArticleResponse creerArticleResponse = new CreerArticleResponse();
        creerArticleResponse.id = article.getId();
        creerArticleResponse.reference = article.getRef();
        creerArticleResponse.label = article.getLabel();
        creerArticleResponse.buyingPrice = article.getBuyingPrice();
        creerArticleResponse.categoryLabel = article.getCategory().getLabel();
        creerArticleResponse.priceHT = article.getPriceHT();
        creerArticleResponse.priceTTC = article.getPriceHT() * (1 + article.getCategory().getTaxe().getAmount());
        creerArticleResponse.promotionAmount = article.getPromotion().getAmount();
        creerArticleResponse.promotionStartDate = article.getPromotion().getStartDate();
        creerArticleResponse.promotionEndDate = article.getPromotion().getEndDate(); //ajouter prix après promotion  + promo dans DTO Response
        return creerArticleResponse;
    }

    @GetMapping("/disponible/{ref}")
    public Boolean isDisponible(@PathVariable String ref) {
        return articleService.isDisponible(ref);
    }

    @GetMapping("/disponible")
    public Boolean isDisponibleWithParam(@RequestParam String ref) {
        return articleService.isDisponible(ref);
    }

}
