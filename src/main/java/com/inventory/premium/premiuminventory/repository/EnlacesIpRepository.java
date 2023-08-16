package com.inventory.premium.premiuminventory.repository;

import com.inventory.premium.premiuminventory.model.EnlacesIp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnlacesIpRepository extends JpaRepository<EnlacesIp, Integer> {

    EnlacesIp findByEnlace(String direccionIp);
}
