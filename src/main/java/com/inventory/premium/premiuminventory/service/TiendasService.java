package com.inventory.premium.premiuminventory.service;

import com.inventory.premium.premiuminventory.model.Tiendas;

import java.util.List;

public interface TiendasService {

    String saveTienda(Tiendas tiendas);

    public List<Tiendas> getAllTiendas();

    Tiendas getTiendaById(Integer tiendaId);

    Tiendas updateTienda(Tiendas newTienda, Integer tiendaId);

    String deleteTienda(Integer tiendaId);

    Tiendas findByTienda(String tienda);
}
