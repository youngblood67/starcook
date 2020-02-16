package org.cnam.starcook.sales.services;

import org.cnam.starcook.sales.domain.Tax;
import org.cnam.starcook.sales.dto.ArticleDetailsRequest;
import org.cnam.starcook.sales.dto.ArticleDetailsResponse;
import org.cnam.starcook.sales.entities.ArticleModel;
import org.cnam.starcook.sales.entities.CategoryModel;
import org.cnam.starcook.sales.entities.PromotionModel;
import org.cnam.starcook.sales.entities.TaxModel;
import org.cnam.starcook.sales.factories.ArticleFactory;
import org.cnam.starcook.sales.repositories.IArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private IArticleRepository articleRepository;

    public List<ArticleDetailsResponse> listArticleDetails() {
        List<ArticleModel> articleModelList = articleRepository.findAll();
        List<ArticleDetailsResponse> articleDetailsResponseList = new ArrayList<ArticleDetailsResponse>();
        for (ArticleModel am : articleModelList) {
            ArticleDetailsResponse articleDetailsResponse = ArticleFactory.BuildArticleDetailsResponse(am);
            articleDetailsResponseList.add(articleDetailsResponse);
        }
        return articleDetailsResponseList;
    }

    public ArticleDetailsResponse findArticleDetailsById(int id) {
        ArticleModel articleModel = articleRepository.findById(id);

        return ArticleFactory.BuildArticleDetailsResponse(articleModel);
    }

    public ArticleModel saveArticle(ArticleDetailsRequest a) {
        TaxModel taxModel = new TaxModel(a.getTaxAmount());
        CategoryModel categoryModel = new CategoryModel(a.getCategoryLabel());
        categoryModel.setTaxe(taxModel);
        ArticleModel articleModel = new ArticleModel();
        articleModel.setRef(a.getRef());
        articleModel.setLabel(a.getLabel());
        articleModel.setCategory(categoryModel);
        articleModel.setPriceHT(a.getPriceHT());
        articleModel.setBuyingPrice(a.getBuyingPrice());
        PromotionModel promotionModel = new PromotionModel();
        promotionModel.setAmount(a.getPromotionAmount());
        promotionModel.setStartDate(a.getPromotionStartDate());
        promotionModel.setEndDate(a.getPromotionEndDate());
        articleModel.setPromotion(promotionModel);
        return articleRepository.save(articleModel);
    }

}
