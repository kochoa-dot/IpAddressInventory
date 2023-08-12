package com.inventory.premium.premiuminventory.service;

import com.inventory.premium.premiuminventory.exception.TiendaNameNotFoundException;
import com.inventory.premium.premiuminventory.exception.TiendasNotFoundException;
import com.inventory.premium.premiuminventory.model.Tiendas;
import com.inventory.premium.premiuminventory.repository.TiendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiendasServiceImpl implements TiendasService{

    @Autowired
    private TiendasRepository tiendasRepository;

    @Override
    public String saveTienda(Tiendas tiendas) {
        tiendasRepository.save(tiendas);
        return "New Tienda has been added";
    }

    @Override
    public List<Tiendas> getAllTiendas() {
        return tiendasRepository.findAll();
    }

    @Override
    public Tiendas getTiendaById(Integer tiendaId) {
        return tiendasRepository.findById(tiendaId).orElseThrow(()-> new TiendasNotFoundException(tiendaId));
    }

    @Override
    public Tiendas updateTienda(Tiendas newTienda, Integer tiendaId) {
        return tiendasRepository.findById(tiendaId).map(tiendas -> {
            tiendas.setTienda(newTienda.getTienda());
            tiendas.setMarcas(newTienda.getMarcas());
            tiendas.setCentrosCostos(newTienda.getCentrosCostos());
            tiendas.setEstado(newTienda.getEstado());
            return tiendasRepository.save(tiendas);
        }).orElseThrow(() -> new TiendasNotFoundException(tiendaId));
    }

    @Override
    public String deleteTienda(Integer tiendaId) {
        if (!tiendasRepository.existsById(tiendaId)) {
            throw new TiendasNotFoundException(tiendaId);
        }
        tiendasRepository.deleteById(tiendaId);
        return "Tienda with id " + tiendaId + " has been deleted success";
    }

    @Override
    public Tiendas findByTienda(String tienda) {
        Tiendas tiendas = tiendasRepository.findByTienda(tienda);
        if (tiendas == null){
            throw new TiendaNameNotFoundException(tienda);
        }
        return tiendas;
    }
}
