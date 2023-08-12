package com.inventory.premium.premiuminventory.controller;

import com.inventory.premium.premiuminventory.model.Tiendas;
import com.inventory.premium.premiuminventory.service.TiendasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiendas")
@CrossOrigin
public class TiendasController {

    @Autowired
    private TiendasService tiendasService;

    @PostMapping("/add")
    public String add(@RequestBody Tiendas tiendas){
        return tiendasService.saveTienda(tiendas);
    }

    @GetMapping("/getAll")
    public List<Tiendas> getAllTiendas(){
        return tiendasService.getAllTiendas();
    }

    @GetMapping("/getTiendaById/{tiendaId}")
    public Tiendas getTiendaById(@PathVariable Integer tiendaId){
        return tiendasService.getTiendaById(tiendaId);
    }

    @PutMapping("/updateTienda/{tiendaId}")
    public Tiendas updateTienda(@RequestBody Tiendas newTienda, @PathVariable Integer tiendaId){
        return tiendasService.updateTienda(newTienda, tiendaId);
    }

    @DeleteMapping("/deleteTienda/{tiendaId}")
    public String deleteTienda(@PathVariable Integer tiendaId){
        return tiendasService.deleteTienda(tiendaId);
    }

    @GetMapping("/getTiendaNameById/{tienda}")
    public Tiendas getTiendaById(@PathVariable String tienda){
        return tiendasService.findByTienda(tienda);
    }

}
