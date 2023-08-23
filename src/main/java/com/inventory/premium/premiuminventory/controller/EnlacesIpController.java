package com.inventory.premium.premiuminventory.controller;

import com.inventory.premium.premiuminventory.model.EnlacesIp;
import com.inventory.premium.premiuminventory.service.EnlacesIpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enlacesIp")
@CrossOrigin
public class EnlacesIpController {

    @Autowired
    private EnlacesIpService enlacesIpService;

    @PostMapping("/add")
    public String add(@RequestBody EnlacesIp enlacesIp){
        return enlacesIpService.saveEnlace(enlacesIp);
    }

    @GetMapping("/getAll")
    public List<EnlacesIp> getAllEnlaces(){
        return enlacesIpService.getAllEnlaces();
    }

    @GetMapping("/getEnlaceById/{enlaceIpId}")
    public EnlacesIp getEnlaceById(@PathVariable Integer enlaceIpId){
        return enlacesIpService.getEnlaceById(enlaceIpId);
    }

    @PutMapping("/updateEnlace/{enlaceIpId}")
    public EnlacesIp updateEnlace(@RequestBody EnlacesIp newEnlace, @PathVariable Integer enlaceIpId){
        return enlacesIpService.updateEnlace(newEnlace, enlaceIpId);
    }

    @DeleteMapping("/deleteEnlace/{enlaceIpId}")
    public String deleteEnlace(@PathVariable Integer enlaceIpId){
        return enlacesIpService.deleteEnlace(enlaceIpId);
    }

    @GetMapping("/getByEnlace/{direccionIp}")
    public EnlacesIp getByEnlace(@PathVariable String direccionIp){
        return enlacesIpService.findByEnlace(direccionIp);
    }
}
