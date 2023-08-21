package com.inventory.premium.premiuminventory.exception;

public class DireccionIpNotFoundException extends RuntimeException {

    public DireccionIpNotFoundException(String direccionIp){
        super("Could not find the direccion Ip with name: " + direccionIp);
    }
}
