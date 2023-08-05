package com.inventory.premium.premiuminventory.service;

import com.inventory.premium.premiuminventory.exception.ProveedorNameNotFoundException;
import com.inventory.premium.premiuminventory.exception.ProveedorNotFoundException;
import com.inventory.premium.premiuminventory.model.Proveedores;
import com.inventory.premium.premiuminventory.repository.ProveedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedoresServiceImpl implements ProveedoresService {

    @Autowired
    private ProveedoresRepository proveedoresRepository;

    @Override
    public String saveProveedor(Proveedores proveedores) {
        proveedoresRepository.save(proveedores);
        return "New proveedor has added";
    }

    @Override
    public List<Proveedores> getAllProveedores() {
        return proveedoresRepository.findAll();
    }

    @Override
    public Proveedores getProveedorByID(Integer proveedorId) {
        return proveedoresRepository.findById(proveedorId).orElseThrow(()-> new ProveedorNotFoundException(proveedorId));
    }

    @Override
    public Proveedores updateProveedor(Proveedores newProveedor, Integer proveedorId) {
        return proveedoresRepository.findById(proveedorId).map(proveedores -> {
            proveedores.setProveedor(newProveedor.getProveedor());
            return proveedoresRepository.save(proveedores);
        }).orElseThrow(()-> new ProveedorNotFoundException(proveedorId));
    }

    @Override
    public String deleteProveedor(Integer proveedorId) {
        if (!proveedoresRepository.existsById(proveedorId)){
            throw new ProveedorNotFoundException(proveedorId);
        }
        proveedoresRepository.deleteById(proveedorId);
        return "Proveedor with id " + proveedorId + " has been deleted success";
    }

    @Override
    public Proveedores findByProveedor(String proveedor) {
        Proveedores proveedores = proveedoresRepository.findByProveedor(proveedor);
        if (proveedor == null){
            throw new ProveedorNameNotFoundException(proveedor);
        }
        return proveedores;
    }
}
