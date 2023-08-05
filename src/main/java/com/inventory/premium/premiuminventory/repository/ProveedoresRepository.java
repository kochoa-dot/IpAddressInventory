package com.inventory.premium.premiuminventory.repository;

import com.inventory.premium.premiuminventory.model.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedoresRepository extends JpaRepository<Proveedores, Integer> {

    Proveedores findByProveedor(String proveedor);
}
