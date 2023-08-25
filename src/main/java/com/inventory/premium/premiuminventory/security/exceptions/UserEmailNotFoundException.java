package com.inventory.premium.premiuminventory.security.exceptions;

public class UserEmailNotFoundException extends RuntimeException {

    public UserEmailNotFoundException(String correo){
        super("Could not find the user with email " + correo);
    }
}
