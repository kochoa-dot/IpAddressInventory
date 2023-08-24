package com.inventory.premium.premiuminventory.repository;

import com.inventory.premium.premiuminventory.model.EnlacesIp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnlacesIpRepository extends JpaRepository<EnlacesIp, Integer> {

    EnlacesIp findByDireccionIp(String direccionIp);
}
