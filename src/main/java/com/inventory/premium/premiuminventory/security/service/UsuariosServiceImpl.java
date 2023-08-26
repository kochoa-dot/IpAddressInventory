package com.inventory.premium.premiuminventory.security.service;

import com.inventory.premium.premiuminventory.model.Estados;
import com.inventory.premium.premiuminventory.security.exceptions.UserNotFoundException;
import com.inventory.premium.premiuminventory.security.model.Usuarios;
import com.inventory.premium.premiuminventory.security.repository.UsuariosRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosServiceImpl implements UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<Usuarios> getByNombreUsuario(String usuario) {
        return usuariosRepository.findByNombreUsuario(usuario);
    }

    @Override
    public boolean existsByNombreUsuario(String usuario) {
        return usuariosRepository.existByNombreUsuario(usuario);
    }

    @Override
    public boolean existsByEmail(String correo) {
        return usuariosRepository.existsByEmail(correo);
    }

    @Override
    public void save(Usuarios usuarios) {
        usuariosRepository.save(usuarios);
    }

    @Override
    public List<Usuarios> getAllUsuarios() {
        return usuariosRepository.findAll();
    }

    @Override
    public Usuarios getUsuarioById(Integer usuarioId) {
        return usuariosRepository.findById(usuarioId).orElseThrow(() -> new UserNotFoundException(usuarioId));
    }

    @Override
    public Usuarios updateUsuario(Usuarios newUser, Integer usuarioId) {
        return usuariosRepository.findById(usuarioId).map(usuarios -> {
            usuarios.setUsuario(newUser.getUsuario());
            usuarios.setNombre(newUser.getNombre());
            usuarios.setCorreo(newUser.getCorreo());
            usuarios.setContrasena(newUser.getContrasena());
            usuarios.setRoles(newUser.getRoles());
            return usuariosRepository.save(usuarios);
        }).orElseThrow(() -> new UserNotFoundException(usuarioId));
    }

    @Override
    public void updateUsuarioEstado(Integer usuarioId, Estados newEstado) {
        Usuarios usuarios = entityManager.find(Usuarios.class, usuarioId);

        if (usuarios != null){
            usuarios.setEstados(newEstado);
            entityManager.merge(usuarios);
        }
    }
}
