package com.inventory.premium.premiuminventory.exception;

public class TiposEIpNameNotFoundException extends RuntimeException {

    public TiposEIpNameNotFoundException(String tipoEnlace){
        super("No tipo found with name: " + tipoEnlace);
    }
}
