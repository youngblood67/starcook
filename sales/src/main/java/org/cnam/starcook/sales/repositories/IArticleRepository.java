package org.cnam.starcook.sales.repositories;

import org.cnam.starcook.sales.entities.ArticleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticleRepository extends JpaRepository<ArticleModel, Integer> {
    ArticleModel findById(int id);
}