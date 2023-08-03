package com.inventory.premium.premiuminventory.service;

import com.inventory.premium.premiuminventory.model.Marcas;

import java.util.List;

public interface MarcasService {

    String saveMarcas(Marcas marcas);

    public List<Marcas> getAllMarcas();

    Marcas getMarcasByID(Integer marcaId);

    Marcas updateMarca(Marcas newMarca, Integer marcaId);

    String deleteMarca(Integer marcaId);

    Marcas findByMarca(String marca);
}
