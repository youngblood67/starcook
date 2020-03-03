package org.cnam.starcook.sales.builders;

import org.cnam.starcook.sales.domain.*;
import org.cnam.starcook.sales.dto.article.ArticleDetailsResponse;
import org.cnam.starcook.sales.entities.*;

public class SalesObjectBuilder {

    public static Tax modelToDomainObject(TaxModel taxModel) {
        Tax tax = new Tax();
        tax.setId(taxModel.getId());
        tax.setAmount(taxModel.getAmount());
        return tax;
    }

    public static Category modelToDomainObject(CategoryModel categoryModel) {
        Category category = new Category();
        category.setId(categoryModel.getId());
        category.setLabel(categoryModel.getLabel());
        category.setTaxe(modelToDomainObject(categoryModel.getTaxe()));
        return category;
    }

    public static Promotion modelToDomainObject(PromotionModel promotionModel) {
        Promotion promotion = new Promotion();
        promotion.setId(promotionModel.getId());
        promotion.setAmount(promotionModel.getAmount());
        promotion.setStartDate(promotionModel.getStartDate());
        promotion.setEndDate(promotionModel.getEndDate());
        return promotion;
    }

    public static Article modelToDomainObject(ArticleModel articleModel) {
        Article article = new Article();
        article.setId(articleModel.getId());
        article.setRef(articleModel.getRef());
        article.setLabel(articleModel.getLabel());
        article.setCategory(modelToDomainObject(articleModel.getCategory()));///////à copntinueer
        article.setPriceHT(articleModel.getPriceHT());
        article.setBuyingPrice(articleModel.getBuyingPrice());
        article.setPromotion(modelToDomainObject(articleModel.getPromotion()));
        return article;
    }

    public static Catalog modelToDomainObject(CatalogModel catalogModel) {
        Catalog catalog = new Catalog();
        catalog.setId(catalogModel.getId());
        catalog.setLabel(catalogModel.getLabel());
        for (ArticleModel articleModel : catalogModel.getArticles()) {
            catalog.getArticles().add(modelToDomainObject(articleModel));
        }
        return catalog;
    }

    public static Commande modelToDomainObject(CommandeModel commandeModel) {
        Commande commande = new Commande();
        commande.setId(commandeModel.getId());
        commande.setReference(commandeModel.getReference());
        commande.setPaid(commandeModel.isPayed());
        commande.setIdClient(commandeModel.getIdClient());
        for (ArticleModel articleModel : commandeModel.getArticles()) {
            Article article = new Article();
            article.setBuyingPrice(articleModel.getBuyingPrice());
            article.setCategory(modelToDomainObject(articleModel.getCategory()));
            article.setId(articleModel.getId());
            article.setLabel(articleModel.getLabel());
            article.setPriceHT(articleModel.getPriceHT());
            article.setRef(articleModel.getRef());
            article.setPromotion(modelToDomainObject(articleModel.getPromotion()));
            commande.getArticles().add(article);
        }
        return commande;
    }

    public static ArticleDetailsResponse modelToDTOArticleDetailsResponse(Article article) {
        ArticleDetailsResponse articleDetailsResponse = new ArticleDetailsResponse();
        articleDetailsResponse.reference = article.getRef();
        articleDetailsResponse.label = article.getLabel();
        articleDetailsResponse.categoryLabel = article.getCategory().getLabel();
        articleDetailsResponse.priceTTC = article.getPriceHT() * (1 + article.getCategory().getTaxe().getAmount());
        return articleDetailsResponse;
    }


}
