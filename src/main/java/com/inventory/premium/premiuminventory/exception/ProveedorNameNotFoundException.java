package com.inventory.premium.premiuminventory.exception;

public class ProveedorNameNotFoundException extends RuntimeException {

    public ProveedorNameNotFoundException(String proveedor){
        super("No proveedor with name: " + proveedor);
    }
}
