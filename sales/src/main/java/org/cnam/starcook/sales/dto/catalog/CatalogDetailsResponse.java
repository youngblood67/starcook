package org.cnam.starcook.sales.dto.catalog;

import org.cnam.starcook.sales.domain.Article;
import org.cnam.starcook.sales.dto.article.ArticleDetailsResponse;

import java.util.ArrayList;
import java.util.List;

public class CatalogDetailsResponse {
    public String label;
    public List<ArticleDetailsResponse> articles = new ArrayList<ArticleDetailsResponse>(); //ArticleResponse

}
