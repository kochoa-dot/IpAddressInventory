package com.inventory.premium.premiuminventory.service;

import com.inventory.premium.premiuminventory.model.Proveedores;

import java.util.List;

public interface ProveedoresService {

    String saveProveedor(Proveedores proveedores);

    public List<Proveedores> getAllProveedores();

    Proveedores getProveedorByID(Integer proveedorId);

    Proveedores updateProveedor(Proveedores newProveedor, Integer proveedorId);

    String deleteProveedor(Integer proveedorId);

    Proveedores findByProveedor(String proveedor);
}
