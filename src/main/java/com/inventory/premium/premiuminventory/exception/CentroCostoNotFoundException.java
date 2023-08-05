package com.inventory.premium.premiuminventory.exception;

public class CentroCostoNotFoundException extends RuntimeException {

    public CentroCostoNotFoundException(Integer id_centroCosto) {
        super("No Centro de Costo found with id " + id_centroCosto);
    }
}
