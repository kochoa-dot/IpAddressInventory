package com.inventory.premium.premiuminventory.exception;

public class ProveedorNotFoundException extends RuntimeException {

    public ProveedorNotFoundException(Integer proveedorId){
        super("Could not found the proveedor with id " + proveedorId);
    }
}
