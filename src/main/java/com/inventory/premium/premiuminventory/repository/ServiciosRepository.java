package com.inventory.premium.premiuminventory.repository;

import com.inventory.premium.premiuminventory.model.Servicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiciosRepository extends JpaRepository<Servicios, Integer> {

    Servicios findByServicio(String servicio);
}
