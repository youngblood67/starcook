package org.cnam.starcook.sales.repositories;

import org.cnam.starcook.sales.domain.Catalog;
import org.cnam.starcook.sales.entities.CatalogModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICatalogRepository extends JpaRepository<CatalogModel, Integer> {
    CatalogModel findById(int id);
}