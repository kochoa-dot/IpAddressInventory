package com.inventory.premium.premiuminventory.exception;

public class ServicioNameNotFoundException extends RuntimeException {

    public ServicioNameNotFoundException(String nombreServicio){
        super("Could not find the Servicio with name: " + nombreServicio);
    }
}
