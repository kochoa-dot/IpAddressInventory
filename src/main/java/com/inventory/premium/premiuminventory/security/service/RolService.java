package com.inventory.premium.premiuminventory.security.service;

import com.inventory.premium.premiuminventory.security.model.Roles;

import java.util.List;

public interface RolService {

    String saveRol(Roles roles);

    public List<Roles> getAllRoles();

    Roles updateRol(Roles newRol, Integer rolId);

    Roles findByRolName(String rolName);
}
