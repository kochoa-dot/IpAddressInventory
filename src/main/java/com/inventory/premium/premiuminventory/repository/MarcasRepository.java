package com.inventory.premium.premiuminventory.repository;

import com.inventory.premium.premiuminventory.model.Marcas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcasRepository extends JpaRepository<Marcas, Integer> {

    Marcas findByMarca(String marca);
}
