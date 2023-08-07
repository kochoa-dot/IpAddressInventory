package com.inventory.premium.premiuminventory.repository;

import com.inventory.premium.premiuminventory.model.TiposEnlancesIp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TiposEnlacesIpRepository extends JpaRepository<TiposEnlancesIp, Integer> {

    TiposEnlancesIp findByTipoEnlace(String tipoEnlace);
}
