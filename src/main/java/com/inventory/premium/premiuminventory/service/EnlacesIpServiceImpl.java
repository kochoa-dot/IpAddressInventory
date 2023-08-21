package com.inventory.premium.premiuminventory.service;

import com.inventory.premium.premiuminventory.exception.DireccionIpNotFoundException;
import com.inventory.premium.premiuminventory.exception.EnlaceIpNotFoundException;
import com.inventory.premium.premiuminventory.model.EnlacesIp;
import com.inventory.premium.premiuminventory.repository.EnlacesIpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnlacesIpServiceImpl implements EnlacesIpService {

    @Autowired
    private EnlacesIpRepository enlacesIpRepository;

    @Override
    public String saveEnlace(EnlacesIp enlacesIp) {
        enlacesIpRepository.save(enlacesIp);
        return "New enlace Ip has added";
    }

    @Override
    public List<EnlacesIp> getAllEnlaces() {
        return enlacesIpRepository.findAll();
    }

    @Override
    public EnlacesIp getEnlaceById(Integer enlaceIpId) {
        return enlacesIpRepository.findById(enlaceIpId).orElseThrow(()-> new EnlaceIpNotFoundException(enlaceIpId));
    }

    @Override
    public EnlacesIp updateEnlace(EnlacesIp newEnlace, Integer enlaceIpId) {
        return enlacesIpRepository.findById(enlaceIpId).map(enlacesIp -> {
            enlacesIp.setDireccionIp(newEnlace.getDireccionIp());
            enlacesIp.setTienda(newEnlace.getTienda());
            enlacesIp.setTipoEnlanceIp(newEnlace.getTipoEnlanceIp());
            return enlacesIpRepository.save(enlacesIp);
        }).orElseThrow(()-> new EnlaceIpNotFoundException(enlaceIpId));
    }

    @Override
    public String deleteEnlace(Integer enlaceIpId) {
        if (!enlacesIpRepository.existsById(enlaceIpId)){
            throw new EnlaceIpNotFoundException(enlaceIpId);
        }
        enlacesIpRepository.deleteById(enlaceIpId);
        return "Enlace with id " + enlaceIpId + " has been deleted success";
    }

    @Override
    public EnlacesIp findByEnlace(String direccionIp) {
        EnlacesIp enlacesIp = enlacesIpRepository.findByEnlace(direccionIp);
        if (enlacesIp == null){
            throw new DireccionIpNotFoundException(direccionIp);
        }
        return enlacesIp;
    }
}
