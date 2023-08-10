package com.inventory.premium.premiuminventory.repository;

import com.inventory.premium.premiuminventory.model.Tiendas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TiendasRepository extends JpaRepository<Tiendas, Integer> {

    Tiendas findByTienda(String tienda);
}
