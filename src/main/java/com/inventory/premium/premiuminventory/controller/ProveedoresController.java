package com.inventory.premium.premiuminventory.controller;

import com.inventory.premium.premiuminventory.model.Proveedores;
import com.inventory.premium.premiuminventory.service.ProveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proveedores")
@CrossOrigin
public class ProveedoresController {

    @Autowired
    private ProveedoresService proveedoresService;

    @PostMapping("/add")
    public String add(@RequestBody Proveedores proveedores){
        return proveedoresService.saveProveedor(proveedores);
    }

    @GetMapping("/getAll")
    public List<Proveedores> getAllProveedores(){
        return proveedoresService.getAllProveedores();
    }

    @GetMapping("/getProveedorById/{proveedorId}")
    public Proveedores getProveedorById(@PathVariable Integer proveedorId){
        return proveedoresService.getProveedorByID(proveedorId);
    }

    @PutMapping("/updateProveedor/{proveedorId}")
    public Proveedores updateProveedor(@RequestBody Proveedores newProveedor, @PathVariable Integer proveedorId){
        return proveedoresService.updateProveedor(newProveedor, proveedorId);
    }

    @DeleteMapping("/deleteProveedor/{proveedorId}")
    public String deleteProveedor(@PathVariable Integer proveedorId){
        return proveedoresService.deleteProveedor(proveedorId);

    }

    @GetMapping("/getByProveedor/{proveedor}")
    public Proveedores getByProveedor(@PathVariable String proveedor){
        return proveedoresService.findByProveedor(proveedor);
    }
}
