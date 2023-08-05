package com.inventory.premium.premiuminventory.exception;

public class CCNameNotFoundException extends RuntimeException {

    public CCNameNotFoundException(String centroCosto){
        super("Could not find the Centro de Costo with name: " + centroCosto);
    }
}
