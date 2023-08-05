package com.inventory.premium.premiuminventory.controller;

import com.inventory.premium.premiuminventory.model.CentrosCostos;
import com.inventory.premium.premiuminventory.service.CentrosCostosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/centroCosto")
@CrossOrigin
public class CentrosCostosController {

    @Autowired
    private CentrosCostosService centrosCostosService;

    @PostMapping("/add")
    public String add(@RequestBody CentrosCostos centrosCostos){
        return centrosCostosService.saveCentroCosto(centrosCostos);
    }

    @GetMapping("/getAll")
    public List<CentrosCostos> getAllCentros(){
        return centrosCostosService.getAllCentros();
    }

    @GetMapping("/getCentroById/{id_centroCosto}")
    public CentrosCostos getCentroById(@PathVariable Integer id_centroCosto){
        return centrosCostosService.getCentroById(id_centroCosto);
    }

    @PutMapping("/updateCentro/{id_centroCosto}")
    public CentrosCostos updateCentro(@RequestBody CentrosCostos newCentrosCostos, @PathVariable Integer id_centroCosto){
        return centrosCostosService.updateCentro(newCentrosCostos, id_centroCosto);
    }

    @DeleteMapping("/deleteCentro/{id_centroCosto}")
    public String deleteCentro(@PathVariable Integer id_centroCosto){
        return centrosCostosService.deleteCentro(id_centroCosto);
    }

    @GetMapping("/getByCentro/{centroCosto}")
    public CentrosCostos getByCentro(@PathVariable String centroCosto){
        return centrosCostosService.findByCentro(centroCosto);
    }
}
