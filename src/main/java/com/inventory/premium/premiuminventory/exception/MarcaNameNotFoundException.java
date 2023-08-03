package com.inventory.premium.premiuminventory.exception;

public class MarcaNameNotFoundException extends RuntimeException {
    public MarcaNameNotFoundException(String marca) {
        super("Could not find the Marca with name: " + marca);
    }
}