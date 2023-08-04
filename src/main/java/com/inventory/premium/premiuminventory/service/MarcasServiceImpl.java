package com.inventory.premium.premiuminventory.service;

import com.inventory.premium.premiuminventory.exception.MarcaNameNotFoundException;
import com.inventory.premium.premiuminventory.exception.MarcaNotFoundException;
import com.inventory.premium.premiuminventory.model.Marcas;
import com.inventory.premium.premiuminventory.repository.MarcasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcasServiceImpl implements MarcasService {

    @Autowired
    private MarcasRepository marcasRepository;


    @Override
    public String saveMarcas(Marcas marcas) {
        marcasRepository.save(marcas);
        return "new Marca has added";
    }

    @Override
    public List<Marcas> getAllMarcas() {
        return marcasRepository.findAll();
    }

    @Override
    public Marcas getMarcasByID(Integer marcaId) {
        return marcasRepository.findById(marcaId).orElseThrow(()-> new MarcaNotFoundException(marcaId));
    }

    @Override
    public Marcas updateMarca(Marcas newMarca, Integer marcaId) {
        return marcasRepository.findById(marcaId).map(marcas -> {
            marcas.setMarca(newMarca.getMarca());
            marcas.setEstado(newMarca.getEstado());
            return marcasRepository.save(marcas);
        }).orElseThrow(()->new MarcaNotFoundException(marcaId));
    }

    @Override
    public String deleteMarca(Integer marcaId) {
        if (!marcasRepository.existsById(marcaId)){
            throw new MarcaNotFoundException(marcaId);
        }
        marcasRepository.deleteById(marcaId);
        return "Marca with id " + marcaId + " has been deleted success";
    }

    @Override
    public Marcas findByMarca(String marca) {
        Marcas marcas = marcasRepository.findByMarca(marca);
        if (marcas == null){
            throw new MarcaNameNotFoundException(marca);
        }
        return marcas;
    }
}
