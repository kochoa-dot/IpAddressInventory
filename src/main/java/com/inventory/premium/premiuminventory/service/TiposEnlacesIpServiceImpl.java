package com.inventory.premium.premiuminventory.service;

import com.inventory.premium.premiuminventory.exception.TiposEIpNameNotFoundException;
import com.inventory.premium.premiuminventory.exception.TiposEnlacesIpNotFoundException;
import com.inventory.premium.premiuminventory.model.TiposEnlancesIp;
import com.inventory.premium.premiuminventory.repository.TiposEnlacesIpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiposEnlacesIpServiceImpl implements TiposEnlacesIpService {

    @Autowired
    private TiposEnlacesIpRepository tiposEnlacesIpRepository;

    @Override
    public String saveTipo(TiposEnlancesIp tiposEnlancesIp) {
        tiposEnlacesIpRepository.save(tiposEnlancesIp);
        return "New tipo has added";
    }

    @Override
    public List<TiposEnlancesIp> getAllTipos() {
        return tiposEnlacesIpRepository.findAll();
    }

    @Override
    public TiposEnlancesIp getTipoByID(Integer tipoEnlaceId) {
        return tiposEnlacesIpRepository.findById(tipoEnlaceId).orElseThrow(()-> new TiposEnlacesIpNotFoundException(tipoEnlaceId));
    }

    @Override
    public TiposEnlancesIp updateTipo(TiposEnlancesIp newTipo, Integer tipoEnlaceId) {
        return tiposEnlacesIpRepository.findById(tipoEnlaceId).map(tiposEnlancesIp -> {
            tiposEnlancesIp.setTipoEnlace(newTipo.getTipoEnlace());
            return tiposEnlacesIpRepository.save(tiposEnlancesIp);
        }).orElseThrow(() -> new TiposEnlacesIpNotFoundException(tipoEnlaceId));
    }

    @Override
    public String deleteTipo(Integer tipoEnlaceId) {
        if (!tiposEnlacesIpRepository.existsById(tipoEnlaceId)){
            throw new TiposEnlacesIpNotFoundException(tipoEnlaceId);
        }
        tiposEnlacesIpRepository.deleteById(tipoEnlaceId);
        return "Tipo with id " + " has been deleted success";
    }

    @Override
    public TiposEnlancesIp findByTipo(String tipoEnlace) {
        TiposEnlancesIp tiposEnlancesIp = tiposEnlacesIpRepository.findByTipoEnlace(tipoEnlace);
        if (tipoEnlace == null){
            throw new TiposEIpNameNotFoundException(tipoEnlace);
        }
        return tiposEnlancesIp;
    }
}
