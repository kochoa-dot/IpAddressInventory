package com.inventory.premium.premiuminventory.repository;

import com.inventory.premium.premiuminventory.model.CentrosCostos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CentrosCostosRepository extends JpaRepository<CentrosCostos, Integer> {
    CentrosCostos findByCentroCosto(String centroCosto);
}
