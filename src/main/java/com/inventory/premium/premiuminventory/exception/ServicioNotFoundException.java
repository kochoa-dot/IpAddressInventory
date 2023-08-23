package com.inventory.premium.premiuminventory.exception;

public class ServicioNotFoundException extends RuntimeException {

    public ServicioNotFoundException(Integer servicioId) {
        super("No servicio found with id " + servicioId);
    }
}
