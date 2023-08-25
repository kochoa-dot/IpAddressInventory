package com.inventory.premium.premiuminventory.security.exceptions;

public class UserNameNotFoundException extends RuntimeException {

    public UserNameNotFoundException(String usuario){
        super("Could not find the user with name: " + usuario);
    }
}
