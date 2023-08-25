package com.inventory.premium.premiuminventory.security.exceptions;

public class RolNameNotFoundException extends RuntimeException {

    public RolNameNotFoundException(String rolName){
        super("Could not find the rol with name: " + rolName);
    }
}
