package com.inventory.premium.premiuminventory.security.exceptions;

public class RolNotFoundException extends RuntimeException {

    public RolNotFoundException(Integer rolId){
        super("No rol found with id " + rolId);
    }
}
