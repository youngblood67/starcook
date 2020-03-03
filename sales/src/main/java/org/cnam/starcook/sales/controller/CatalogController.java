package org.cnam.starcook.sales.controller;

import org.cnam.starcook.sales.builders.SalesObjectBuilder;
import org.cnam.starcook.sales.domain.Article;
import org.cnam.starcook.sales.domain.Catalog;
import org.cnam.starcook.sales.dto.catalog.CatalogDetailsResponse;
import org.cnam.starcook.sales.services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/catalogs")
public class CatalogController {
    @Autowired
    private CatalogService catalogService;

    @GetMapping
    public List<CatalogDetailsResponse> listAllCatalogs() {
        List<CatalogDetailsResponse> catalogDetailsResponseList = new ArrayList<CatalogDetailsResponse>();
        List<Catalog> catalogsList = catalogService.listCatalogs();
        for (Catalog catalog : catalogsList) {
            CatalogDetailsResponse catalogDetailsResponse = new CatalogDetailsResponse();
            catalogDetailsResponse.label = catalog.getLabel();
            for(Article article : catalog.getArticles()){
                catalogDetailsResponse.articles.add(SalesObjectBuilder.modelToDTOArticleDetailsResponse(article));
            }
            catalogDetailsResponseList.add(catalogDetailsResponse);
        }
        return catalogDetailsResponseList;
    }

    @GetMapping("/{id}")
    public CatalogDetailsResponse getCatalogById(@PathVariable int id) {
        CatalogDetailsResponse catalogDetailsResponse = new CatalogDetailsResponse();
        Catalog catalog = catalogService.findCatalogById(id);
        catalogDetailsResponse.label = catalog.getLabel();
        for(Article article : catalog.getArticles()){
            catalogDetailsResponse.articles.add(SalesObjectBuilder.modelToDTOArticleDetailsResponse(article));
        }
        return catalogDetailsResponse;
    }

    //ajouter un article au catalog

}
