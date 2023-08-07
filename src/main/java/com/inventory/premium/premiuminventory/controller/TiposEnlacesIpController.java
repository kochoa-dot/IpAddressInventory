package com.inventory.premium.premiuminventory.controller;

import com.inventory.premium.premiuminventory.model.TiposEnlancesIp;
import com.inventory.premium.premiuminventory.service.TiposEnlacesIpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiposEnlacesIp")
@CrossOrigin
public class TiposEnlacesIpController {

    @Autowired
    private TiposEnlacesIpService tiposEnlacesIpService;

    @PostMapping("/add")
    public String add(@RequestBody TiposEnlancesIp tiposEnlancesIp){
        return tiposEnlacesIpService.saveTipo(tiposEnlancesIp);
    }

    @GetMapping("/getAll")
    public List<TiposEnlancesIp> getAllTipos(){
        return tiposEnlacesIpService.getAllTipos();
    }

    @GetMapping("/getTiposById/{tipoEnlaceId}")
    public TiposEnlancesIp getTiposById(@PathVariable Integer tipoEnlaceId){
        return tiposEnlacesIpService.getTipoByID(tipoEnlaceId);
    }

    @PutMapping("/updateTipo/{tipoEnlaceId}")
    public TiposEnlancesIp updateTipos(@RequestBody TiposEnlancesIp newTipo, @PathVariable Integer tipoEnlaceId){
        return tiposEnlacesIpService.updateTipo(newTipo, tipoEnlaceId);
    }

    @DeleteMapping("/deleteTipo/{tipoEnlaceId}")
    public String deleteTipo(@PathVariable Integer tipoEnlaceId){
        return tiposEnlacesIpService.deleteTipo(tipoEnlaceId);

    }

    @GetMapping("/getByTipo/{tipoEnlace}")
    public TiposEnlancesIp getByTipo(@PathVariable String tipoEnlace){
        return tiposEnlacesIpService.findByTipo(tipoEnlace);
    }
}
