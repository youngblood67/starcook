package org.cnam.starcook.sales.services;

import org.cnam.starcook.sales.domain.Article;
import org.cnam.starcook.sales.dto.article.CreerArticleRequest;
import org.cnam.starcook.sales.entities.ArticleModel;
import org.cnam.starcook.sales.entities.CategoryModel;
import org.cnam.starcook.sales.entities.PromotionModel;
import org.cnam.starcook.sales.entities.TaxModel;
import org.cnam.starcook.sales.builders.SalesObjectBuilder;
import org.cnam.starcook.sales.repositories.IArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private IArticleRepository articleRepository;

    public List<Article> listArticles() {
        List<ArticleModel> articleModelList = articleRepository.findAll();
        List<Article> articlesList = new ArrayList<Article>();
        for (ArticleModel am : articleModelList) {
            Article article = SalesObjectBuilder.modelToDomainObject(am);
            articlesList.add(article);
        }
        return articlesList;
    }

    public Article findArticleById(int id) {
        ArticleModel articleModel = articleRepository.findById(id);
        return SalesObjectBuilder.modelToDomainObject(articleModel);
    }

    public Article createArticle(CreerArticleRequest creerArticleRequest) {

        TaxModel taxModel = new TaxModel(creerArticleRequest.taxAmount);
        CategoryModel categoryModel = new CategoryModel(creerArticleRequest.categoryLabel, taxModel);
        categoryModel.setTaxe(taxModel);
        PromotionModel promotionModel = new PromotionModel(creerArticleRequest.promotionAmount, creerArticleRequest.promotionStartDate, creerArticleRequest.promotionEndDate);
        ArticleModel articleModel = new ArticleModel(creerArticleRequest.reference, creerArticleRequest.label, categoryModel, creerArticleRequest.priceHT, creerArticleRequest.buyingPrice, promotionModel);
        articleModel.setPromotion(promotionModel);
        ArticleModel savedArticleModel = articleRepository.save(articleModel);
        Article article = SalesObjectBuilder.modelToDomainObject(savedArticleModel);
        return article;
    }

    public Boolean isDisponible(String reference) {
        ArticleModel articleModel = articleRepository.findByReference(reference);
        return articleModel != null;
    }
}
