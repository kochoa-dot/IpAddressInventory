package com.inventory.premium.premiuminventory.controller;

import com.inventory.premium.premiuminventory.model.Estados;
import com.inventory.premium.premiuminventory.service.EstadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estados")
@CrossOrigin
public class EstadosController {

    @Autowired
    private EstadosService estadosService;

    @PostMapping("/add")
    public String add(@RequestBody Estados estados){
        return estadosService.saveEstado(estados);
    }

    @GetMapping("/getAll")
    public List<Estados> getAllEstados(){
        return estadosService.getAllEstados();
    }

    @GetMapping("/getEstadoById/{estadoId}")
    public Estados getEstadoById(@PathVariable Integer estadoId){
        return estadosService.getEstadosById(estadoId);
    }

    @PutMapping("/updateEstado/{estadoId}")
    public Estados updateEstado(@RequestBody Estados newEstado, @PathVariable Integer estadoId){
        return estadosService.updateEstados(newEstado, estadoId);
    }

    @DeleteMapping("/deleteEstado/{estadoId}")
    public String deleteEstado(@PathVariable Integer estadoId){
        return estadosService.deleteEstado(estadoId);
    }
}
