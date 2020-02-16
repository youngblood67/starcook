package org.cnam.starcook.sales.repositories;

import org.cnam.starcook.sales.domain.Tax;
import org.cnam.starcook.sales.entities.TaxModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaxRepository extends JpaRepository<TaxModel, Integer> {
}