package com.inventory.premium.premiuminventory.controller;

import com.inventory.premium.premiuminventory.model.Marcas;
import com.inventory.premium.premiuminventory.service.MarcasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
@CrossOrigin
public class MarcasController {
    @Autowired
    private MarcasService marcasService;

    @PostMapping("/add")
    public String add(@RequestBody Marcas marcas){
        return marcasService.saveMarcas(marcas);
    }

    @GetMapping("/getAll")
    public List<Marcas> getAllMarcas(){
        return marcasService.getAllMarcas();
    }

    @GetMapping("/getMarcasById/{marcaId}")
    public Marcas getMarcasById(@PathVariable Integer marcaId){
        return marcasService.getMarcasByID(marcaId);
    }

    @PutMapping("/updateMarca/{marcaId}")
    public Marcas updateMarca(@RequestBody Marcas newMarca, @PathVariable Integer marcaId){
        return marcasService.updateMarca(newMarca, marcaId);
    }

    @DeleteMapping("/deleteMarca/{marcaId}")
    public String deleteMarca(@PathVariable Integer marcaId){
        return marcasService.deleteMarca(marcaId);
    }

    @GetMapping("/getMarcaName/{marca}")
    public Marcas getMarcaName(@PathVariable String marca){
        return marcasService.findByMarca(marca);
    }
}
