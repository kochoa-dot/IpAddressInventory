package com.inventory.premium.premiuminventory.security.service;

import com.inventory.premium.premiuminventory.model.Estados;
import com.inventory.premium.premiuminventory.security.model.Usuarios;

import java.util.List;
import java.util.Optional;

public interface UsuariosService {

    public Optional<Usuarios> getByNombreUsuario(String usuario);

    public boolean existsByNombreUsuario(String usuario);

    public boolean existsByEmail(String correo);

    public void save(Usuarios usuarios);

    public List<Usuarios> getAllUsuarios();

    Usuarios getUsuarioById(Integer usuarioId);

    Usuarios updateUsuario(Usuarios newUser, Integer usuarioId);

    void updateUsuarioEstado(Integer usuarioId, Estados newEstado);

}
