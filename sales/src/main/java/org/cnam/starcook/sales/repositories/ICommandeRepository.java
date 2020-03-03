package org.cnam.starcook.sales.repositories;

import org.cnam.starcook.sales.entities.CommandeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommandeRepository extends JpaRepository<CommandeModel, Integer> {
    CommandeModel findById(int id);
}
