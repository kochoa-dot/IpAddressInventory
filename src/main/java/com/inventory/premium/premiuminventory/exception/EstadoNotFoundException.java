package com.inventory.premium.premiuminventory.exception;

public class EstadoNotFoundException extends RuntimeException {

    public EstadoNotFoundException(Integer estadoId){
        super("No estado found with name: " + estadoId);
    }
}
