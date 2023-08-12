package com.inventory.premium.premiuminventory.repository;

import com.inventory.premium.premiuminventory.model.Estados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadosRepository extends JpaRepository<Estados, Integer> {
}
