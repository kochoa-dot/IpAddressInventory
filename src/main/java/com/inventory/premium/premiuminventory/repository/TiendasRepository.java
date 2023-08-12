package com.inventory.premium.premiuminventory.repository;

import com.inventory.premium.premiuminventory.model.Tiendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiendasRepository extends JpaRepository<Tiendas, Integer> {

    Tiendas findByTienda(String tienda);
}
