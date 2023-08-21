package com.inventory.premium.premiuminventory.exception;

public class EnlaceIpNotFoundException extends RuntimeException {

    public EnlaceIpNotFoundException(Integer enlaceIpId) {
        super("No Enlace Ip found with id " + enlaceIpId);
    }
}
