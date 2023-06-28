package dev.RIV.Demo.API.REST.services;

import dev.RIV.Demo.API.REST.modelDTO.GenericDTO;
import dev.RIV.Demo.API.REST.models.Generic;
import dev.RIV.Demo.API.REST.repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenericService {
    private final GenericRepository genericRepository;

    //todo explain this
    @Autowired
    public GenericService (GenericRepository genericRepository) { this.genericRepository = genericRepository; }

    public Generic createGeneric(GenericDTO genericDTO) {
        Generic generic = new Generic(genericDTO.getGenericId(), genericDTO.getGenericHash(), genericDTO.getGenericName(), genericDTO.getGenericPayload());
        return this.genericRepository.save(generic);
    }

    public Generic getGenericById(int genericId) {
        return this.genericRepository.getReferenceById(genericId);
    }

    public Generic updateGenericById(int genericId, GenericDTO genericDTO) {
        Generic genericUpdate = new Generic(genericDTO.getGenericId(), genericDTO.getGenericHash(), genericDTO.getGenericName(), genericDTO.getGenericPayload());
        //optional put a check in here to compare these two objects before saving
        Generic genericOld = this.genericRepository.getReferenceById(genericId);
        return this.genericRepository.save(genericUpdate);
    }

    public void deleteGenericById(int genericId) {
        this.genericRepository.deleteById(genericId);
    }
}
