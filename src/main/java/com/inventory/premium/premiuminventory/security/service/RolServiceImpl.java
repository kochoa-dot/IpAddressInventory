package com.inventory.premium.premiuminventory.security.service;

import com.inventory.premium.premiuminventory.security.exceptions.RolNameNotFoundException;
import com.inventory.premium.premiuminventory.security.exceptions.RolNotFoundException;
import com.inventory.premium.premiuminventory.security.model.Roles;
import com.inventory.premium.premiuminventory.security.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    private RolesRepository rolesRepository;

    @Override
    public String saveRol(Roles roles) {
        rolesRepository.save(roles);
        return "New rol has been added";
    }

    @Override
    public List<Roles> getAllRoles() {
        return rolesRepository.findAll();
    }

    @Override
    public Roles updateRol(Roles newRol, Integer rolId) {
        return rolesRepository.findById(rolId).map(roles -> {
            roles.setRolName(newRol.getRolName());
            return rolesRepository.save(roles);
        }).orElseThrow(()-> new RolNotFoundException(rolId));
    }

    @Override
    public Roles findByRolName(String rolName) {
        Roles roles = rolesRepository.findByRolName(rolName);
        if (roles == null){
            throw new RolNameNotFoundException(rolName);
        }
        return roles;
    }
}
