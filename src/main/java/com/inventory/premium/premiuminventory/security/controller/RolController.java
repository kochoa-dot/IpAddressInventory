package com.inventory.premium.premiuminventory.security.controller;

import com.inventory.premium.premiuminventory.security.model.Roles;
import com.inventory.premium.premiuminventory.security.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rol")
@CrossOrigin
public class RolController {

    @Autowired
    private RolService rolService;

    @PostMapping("/add")
    public String add(@RequestBody Roles roles){
        return rolService.saveRol(roles);
    }

    @GetMapping("/getAll")
    public List<Roles> getAllRoles(){
        return rolService.getAllRoles();
    }

    @PutMapping("/updateRol/{rolId}")
    public Roles updateRol(@RequestBody Roles newRol, @PathVariable Integer rolId){
        return rolService.updateRol(newRol, rolId);
    }

    @GetMapping("/getByRolName/{rolName}")
    public Roles getByRolName(@PathVariable String rolName){
        return rolService.findByRolName(rolName);
    }
}
