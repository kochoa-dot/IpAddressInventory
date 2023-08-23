package com.inventory.premium.premiuminventory.service;

import com.inventory.premium.premiuminventory.exception.ServicioNameNotFoundException;
import com.inventory.premium.premiuminventory.exception.ServicioNotFoundException;
import com.inventory.premium.premiuminventory.model.Servicios;
import com.inventory.premium.premiuminventory.repository.ServiciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosServiceImpl implements ServiciosService {

    @Autowired
    private ServiciosRepository serviciosRepository;

    @Override
    public String saveServicio(Servicios servicios) {
        serviciosRepository.save(servicios);
        return "New servicio has been added";
    }

    @Override
    public List<Servicios> getAllServicios() {
        return serviciosRepository.findAll();
    }

    @Override
    public Servicios getServiciobyId(Integer servicioId) {
        return serviciosRepository.findById(servicioId).orElseThrow(()-> new ServicioNotFoundException(servicioId));
    }

    @Override
    public Servicios updateServicio(Servicios newServicio, Integer servicioId) {
        return serviciosRepository.findById(servicioId).map(servicios -> {
            servicios.setNombreServicio(newServicio.getNombreServicio());
            servicios.setProveedores(newServicio.getProveedores());
            servicios.setEnlacesIp(newServicio.getEnlacesIp());
            return serviciosRepository.save(servicios);
        }).orElseThrow(() -> new ServicioNotFoundException(servicioId));
    }

    @Override
    public String deleteServicio(Integer servicioId) {
        if (!serviciosRepository.existsById(servicioId)) {
            throw new ServicioNotFoundException(servicioId);
        }
        serviciosRepository.deleteById(servicioId);
        return "Servicio with id " + servicioId + " has been deleted success";
    }

    @Override
    public Servicios findByServicio(String nombreServicio) {
        Servicios servicios = serviciosRepository.findByServicio(nombreServicio);
        if (servicios == null){
            throw new ServicioNameNotFoundException(nombreServicio);
        }
        return servicios;
    }
}
