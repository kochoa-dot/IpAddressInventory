package com.inventory.premium.premiuminventory.service;

import com.inventory.premium.premiuminventory.model.Estados;

import java.util.List;

public interface EstadosService {

    String saveEstado(Estados estados);

    public List<Estados> getAllEstados();

    Estados getEstadosById(Integer estadoId);

    Estados updateEstados(Estados newEstado, Integer estadoId);

    String deleteEstado(Integer estadoId);
}
