package com.inventory.premium.premiuminventory.service;

import com.inventory.premium.premiuminventory.model.EnlacesIp;

import java.util.List;

public interface EnlacesIpService {

    String saveEnlace(EnlacesIp enlacesIp);

    public List<EnlacesIp> getAllEnlaces();

    EnlacesIp getEnlaceById(Integer enlaceIpId);

    EnlacesIp updateEnlace(EnlacesIp newEnlace, Integer enlaceIpId);

    String deleteEnlace(Integer enlaceIpId);

    EnlacesIp findByEnlace(String direccionIp);
}
