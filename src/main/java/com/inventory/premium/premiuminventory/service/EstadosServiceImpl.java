package com.inventory.premium.premiuminventory.service;

import com.inventory.premium.premiuminventory.exception.EstadoNotFoundException;
import com.inventory.premium.premiuminventory.model.Estados;
import com.inventory.premium.premiuminventory.repository.EstadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstadosServiceImpl implements EstadosService {

    @Autowired
    private EstadosRepository estadosRepository;

    @Override
    public String saveEstado(Estados estados) {
        estadosRepository.save(estados);
        return "New estado has added";
    }

    @Override
    public List<Estados> getAllEstados() {
        return estadosRepository.findAll();
    }

    @Override
    public Estados getEstadosById(Integer estadoId) {
        return estadosRepository.findById(estadoId).orElseThrow(()-> new EstadoNotFoundException(estadoId));
    }

    @Override
    public Estados updateEstados(Estados newEstado, Integer estadoId) {
        return estadosRepository.findById(estadoId).map(estados -> {
            estados.setEstado(newEstado.getEstado());
            return estadosRepository.save(estados);
        }).orElseThrow(()-> new EstadoNotFoundException(estadoId));
    }

    @Override
    public String deleteEstado(Integer estadoId) {
        if (!estadosRepository.existsById(estadoId)){
            throw new EstadoNotFoundException(estadoId);
        }
        estadosRepository.deleteById(estadoId);
        return "Estado with id " + estadoId + " has been deleted success";
    }
}
