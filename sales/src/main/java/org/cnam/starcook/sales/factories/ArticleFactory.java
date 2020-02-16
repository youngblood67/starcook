package org.cnam.starcook.sales.factories;

import org.cnam.starcook.sales.domain.Tax;
import org.cnam.starcook.sales.dto.ArticleDetailsResponse;
import org.cnam.starcook.sales.entities.ArticleModel;
import org.cnam.starcook.sales.entities.TaxModel;

public class ArticleFactory {
    public static ArticleDetailsResponse BuildArticleDetailsResponse(ArticleModel articleModel) {
        ArticleDetailsResponse articleDetailsResponse = new ArticleDetailsResponse();

        try{
            articleDetailsResponse.setRef(articleModel.getRef());
        }catch(Exception e){
            articleDetailsResponse.setRef("NO REF");
        }

        try{
            articleDetailsResponse.setLabel(articleModel.getLabel());
        }catch (Exception e){
            articleDetailsResponse.setLabel("NO LABEL");
        }

        try{
            articleDetailsResponse.setCategoryLabel(articleModel.getCategory().getLabel());
        }catch(Exception e){
            articleDetailsResponse.setCategoryLabel("NO CATEGORY");
        }

        try{
            articleDetailsResponse.setPriceTTC(articleModel.getPriceHT() * (1 + articleModel.getCategory().getTaxe().getAmount()));
        }catch(Exception e){
            articleDetailsResponse.setPriceTTC(articleModel.getPriceHT());
        }
        return articleDetailsResponse;
    }
}
