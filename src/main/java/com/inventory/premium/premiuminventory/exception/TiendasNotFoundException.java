package com.inventory.premium.premiuminventory.exception;

public class TiendasNotFoundException extends RuntimeException {

    public TiendasNotFoundException(Integer tiendaId) {
        super("No tienda found with id " + tiendaId);
    }
}
