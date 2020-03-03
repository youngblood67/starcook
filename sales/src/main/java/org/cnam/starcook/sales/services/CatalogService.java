package org.cnam.starcook.sales.services;

import org.cnam.starcook.sales.builders.SalesObjectBuilder;
import org.cnam.starcook.sales.domain.Catalog;
import org.cnam.starcook.sales.entities.*;
import org.cnam.starcook.sales.repositories.ICatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatalogService {
    @Autowired
    private ICatalogRepository catalogRepository;

    public List<Catalog> listCatalogs() {
        List<CatalogModel> catalogsModelList = catalogRepository.findAll();
        List<Catalog> catalogsList = new ArrayList<Catalog>();
        for (CatalogModel cm : catalogsModelList) {
            Catalog catalog = SalesObjectBuilder.modelToDomainObject(cm);
            catalogsList.add(catalog);
        }
        return catalogsList;
    }

    public Catalog findCatalogById(int id) {
        CatalogModel catalogModel = catalogRepository.findById(id);
        return  SalesObjectBuilder.modelToDomainObject(catalogModel);
    }

}
