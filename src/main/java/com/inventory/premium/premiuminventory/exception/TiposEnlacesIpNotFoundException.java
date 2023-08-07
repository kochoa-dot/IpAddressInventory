package com.inventory.premium.premiuminventory.exception;

public class TiposEnlacesIpNotFoundException extends RuntimeException {

    public TiposEnlacesIpNotFoundException(Integer tipoEnlaceId){
        super("Could not found the tipo with id " + tipoEnlaceId);
    }
}
