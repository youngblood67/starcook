package org.cnam.starcook.sales.dto.commande;

import org.cnam.starcook.sales.domain.Article;
import org.cnam.starcook.sales.dto.article.ArticleDetailsResponse;

import java.util.ArrayList;
import java.util.List;

public class CommandeDetailsResponse {
    public String reference;
    public int idClient;
    public List<ArticleDetailsResponse> articles = new ArrayList<ArticleDetailsResponse>(); //ArticleResponse
    public boolean isPayed;
}
