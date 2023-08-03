package com.inventory.premium.premiuminventory.exception;

public class MarcaNotFoundException extends RuntimeException {
    public MarcaNotFoundException(Integer marcaId){
        super("Could not found the Marca with id " + marcaId);
    }

}
