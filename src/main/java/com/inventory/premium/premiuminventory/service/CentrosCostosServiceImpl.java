package com.inventory.premium.premiuminventory.service;

import com.inventory.premium.premiuminventory.exception.CCNameNotFoundException;
import com.inventory.premium.premiuminventory.exception.CentroCostoNotFoundException;
import com.inventory.premium.premiuminventory.model.CentrosCostos;
import com.inventory.premium.premiuminventory.repository.CentrosCostosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CentrosCostosServiceImpl implements CentrosCostosService {

    @Autowired
    private CentrosCostosRepository centrosCostosRepository;

    @Override
    public String saveCentroCosto(CentrosCostos centrosCostos) {
        centrosCostosRepository.save(centrosCostos);
        return "New Centro has been added";
    }

    @Override
    public List<CentrosCostos> getAllCentros() {
        return centrosCostosRepository.findAll();
    }

    @Override
    public CentrosCostos getCentroById(Integer id_centroCosto) {
        return centrosCostosRepository.findById(id_centroCosto).orElseThrow(()-> new CentroCostoNotFoundException(id_centroCosto));
    }

    @Override
    public CentrosCostos updateCentro(CentrosCostos newCentro, Integer id_centroCosto) {
        return centrosCostosRepository.findById(id_centroCosto).map(centrosCostos -> {
            centrosCostos.setCentroCosto(newCentro.getCentroCosto());
            return centrosCostosRepository.save(centrosCostos);
        }).orElseThrow(()-> new CentroCostoNotFoundException(id_centroCosto));
    }

    @Override
    public String deleteCentro(Integer id_centroCosto) {
        if (!centrosCostosRepository.existsById(id_centroCosto)){
            throw new CentroCostoNotFoundException(id_centroCosto);
        }
        centrosCostosRepository.deleteById(id_centroCosto);
        return "Centro with id " + id_centroCosto + " has been deleted success";
    }

    @Override
    public CentrosCostos findByCentro(String centroCosto) {
        CentrosCostos centrosCostos = centrosCostosRepository.findByCentroCosto(centroCosto);
        if (centrosCostos == null){
            throw new CCNameNotFoundException(centroCosto);
        }
        return centrosCostos;
    }
}
