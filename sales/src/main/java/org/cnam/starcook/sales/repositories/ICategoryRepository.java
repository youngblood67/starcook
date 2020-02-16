package org.cnam.starcook.sales.repositories;

import org.cnam.starcook.sales.domain.Category;
import org.cnam.starcook.sales.entities.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<CategoryModel, Integer> {
    CategoryModel findCategoryModelById(int id);
    CategoryModel findCategoryModelByLabel(String label);
}
