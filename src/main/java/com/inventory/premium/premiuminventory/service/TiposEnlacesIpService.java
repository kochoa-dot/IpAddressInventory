package com.inventory.premium.premiuminventory.service;

import com.inventory.premium.premiuminventory.model.TiposEnlancesIp;

import java.util.List;

public interface TiposEnlacesIpService {

    String saveTipo(TiposEnlancesIp tiposEnlancesIp);

    public List<TiposEnlancesIp> getAllTipos();

    TiposEnlancesIp getTipoByID(Integer tipoEnlaceId);

    TiposEnlancesIp updateTipo(TiposEnlancesIp newTipo, Integer tipoEnlaceId);

    String deleteTipo(Integer tipoEnlaceId);

    TiposEnlancesIp findByTipo(String tipoEnlace);
}
