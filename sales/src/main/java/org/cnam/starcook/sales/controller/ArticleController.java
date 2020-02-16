package org.cnam.starcook.sales.controller;

import org.cnam.starcook.sales.dto.ArticleDetailsRequest;
import org.cnam.starcook.sales.dto.ArticleDetailsResponse;
import org.cnam.starcook.sales.entities.ArticleModel;
import org.cnam.starcook.sales.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/articles")
    public List<ArticleDetailsResponse> listAllArticles() {
        return articleService.listArticleDetails();
    }

    @GetMapping("/articles/{id}")
    public ArticleDetailsResponse getArticleById(@PathVariable int id) {
        return articleService.findArticleDetailsById(id);
    }

    @PostMapping("/articles")
    @ResponseBody
    public ArticleModel saveArticle(@RequestBody ArticleDetailsRequest articleDetailsRequest) {
        return articleService.saveArticle(articleDetailsRequest);
    }


}
