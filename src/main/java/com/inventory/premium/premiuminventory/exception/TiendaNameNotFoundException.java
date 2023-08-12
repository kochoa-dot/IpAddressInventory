package com.inventory.premium.premiuminventory.exception;

public class TiendaNameNotFoundException extends RuntimeException {

    public TiendaNameNotFoundException(String tienda) {
        super("Could not find the tienda with name: " + tienda);
    }
}
