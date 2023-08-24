package com.inventory.premium.premiuminventory.controller;

import com.inventory.premium.premiuminventory.model.Servicios;
import com.inventory.premium.premiuminventory.service.ServiciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicios")
@CrossOrigin
public class ServiciosController {

    @Autowired
    private ServiciosService serviciosService;

    @PostMapping("/add")
    public String add(@RequestBody Servicios servicios){
        return serviciosService.saveServicio(servicios);
    }

    @GetMapping("/getAll")
    public List<Servicios> getAllServicios(){
        return serviciosService.getAllServicios();
    }

    @GetMapping("/getServicioById/{servicioId}")
    public Servicios getServicioById(@PathVariable Integer servicioId){
        return serviciosService.getServiciobyId(servicioId);
    }

    @PutMapping("/updateServicio/{servicioId}")
    public Servicios updateServicio(@RequestBody Servicios newServicio, @PathVariable Integer servicioId){
        return serviciosService.updateServicio(newServicio, servicioId);
    }

    @DeleteMapping("/deleteServicio/{servicioId}")
    public String deleteServicio(@PathVariable Integer servicioId){
        return serviciosService.deleteServicio(servicioId);
    }

    @GetMapping("/getByServicio/{servicio}")
    public Servicios getByServicio(@PathVariable String servicio){
        return serviciosService.findByServicio(servicio);
    }
}
