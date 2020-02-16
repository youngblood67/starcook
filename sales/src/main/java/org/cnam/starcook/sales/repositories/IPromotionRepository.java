package org.cnam.starcook.sales.repositories;

import org.cnam.starcook.sales.domain.Promotion;
import org.cnam.starcook.sales.entities.PromotionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPromotionRepository extends JpaRepository<PromotionModel, Integer> {
}
