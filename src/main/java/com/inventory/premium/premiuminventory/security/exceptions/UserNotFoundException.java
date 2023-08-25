package com.inventory.premium.premiuminventory.security.exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Integer usuarioId) {
        super("No User found with id " + usuarioId);
    }
}
