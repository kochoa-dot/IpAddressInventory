package com.inventory.premium.premiuminventory.service;

import com.inventory.premium.premiuminventory.model.Servicios;

import java.util.List;

public interface ServiciosService {

    String saveServicio(Servicios servicios);

    public List<Servicios> getAllServicios();

    Servicios getServiciobyId(Integer servicioId);

    Servicios updateServicio(Servicios newServicio, Integer servicioId);

    String deleteServicio(Integer servicioId);

    Servicios findByServicio(String nombreServicio);
}
