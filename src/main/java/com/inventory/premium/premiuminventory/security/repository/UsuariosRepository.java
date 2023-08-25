package com.inventory.premium.premiuminventory.security.repository;

import com.inventory.premium.premiuminventory.security.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {

    Optional<Usuarios> findByNombreUsuario(String usuario);

    boolean existByNombreUsuario(String usuario);

    boolean existsByEmail(String correo);
}
