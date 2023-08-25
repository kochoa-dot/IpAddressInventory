package com.inventory.premium.premiuminventory.security.repository;

import com.inventory.premium.premiuminventory.security.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {

    //Optional<Roles> findByRol(RolNombre rolNombre);

    Roles findByRol(String rolName);
}
