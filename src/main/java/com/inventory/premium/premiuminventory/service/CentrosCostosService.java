package com.inventory.premium.premiuminventory.service;

import com.inventory.premium.premiuminventory.model.CentrosCostos;

import java.util.List;

public interface CentrosCostosService {

    String saveCentroCosto(CentrosCostos centrosCostos);

    public List<CentrosCostos> getAllCentros();

    CentrosCostos getCentroById(Integer id_centroCosto);

    CentrosCostos updateCentro(CentrosCostos newCentro, Integer id_centroCosto);

    String deleteCentro(Integer id_centroCosto);

    CentrosCostos findByCentro(String centroCosto);
}
