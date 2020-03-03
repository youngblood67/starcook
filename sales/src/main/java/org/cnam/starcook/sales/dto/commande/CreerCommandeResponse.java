package org.cnam.starcook.sales.dto.commande;

import org.cnam.starcook.sales.dto.article.ArticleDetailsResponse;

import java.util.ArrayList;
import java.util.List;

public class CreerCommandeResponse {
    public int id;
    public String reference;
    public int idClient;
    public List<ArticleDetailsResponse> articles = new ArrayList<ArticleDetailsResponse>(); //ArticleResponse

    public boolean isPayed;
}
