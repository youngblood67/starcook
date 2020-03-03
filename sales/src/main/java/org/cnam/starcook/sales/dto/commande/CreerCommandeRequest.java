package org.cnam.starcook.sales.dto.commande;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.cnam.starcook.sales.domain.Article;
import org.cnam.starcook.sales.dto.article.ArticleToCommandRequest;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = false)
@Validated
public class CreerCommandeRequest {

    public int idClient;
    public List<ArticleToCommandRequest> articles = new ArrayList<ArticleToCommandRequest>();
    public boolean isPayed;
}
