package dev.RIV.Demo.API.REST.controllers;

import dev.RIV.Demo.API.REST.modelDTO.GenericDTO;
import dev.RIV.Demo.API.REST.models.Generic;
import dev.RIV.Demo.API.REST.services.GenericService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/generic")
@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:5000", "http://localhost:8080" } )
public class GenericController {

    private GenericService genericService;
    private ModelMapper modelMapper = new ModelMapper();
    
    /*
    Autowired is a means to inject dependencies into a class, in this case the GenericController class.
    These dependencies are defined in the package "SpringDooters" specifically "SpringConfig"
    Here we're just using model mapper to map the DTO to the model and vice versa.
    Elsewhere in the application, additional custom beans will be used to generate hashes
    In other applications, since beans are essentially arbitrary in function, we can do literally anything with them.
    Common functions include Spring's own security beans, password encryptors, and other common helper methods.
    */
    @Autowired
    public GenericController(GenericService genericService, ModelMapper modelMapper) {
        this.genericService = genericService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public Optional<Generic> createGeneric(GenericDTO genericDTO){
        return Optional.of(this.genericService.createGeneric(genericDTO));
    }

    @GetMapping
    public Optional<Generic> getGeneric(int genericId) {
        return Optional.of(this.genericService.getGenericById(genericId));
    }

    @PutMapping
    public Optional<Generic> updateGeneric(int genericId, GenericDTO genericDTO) {
        return Optional.of(this.genericService.updateGenericById(genericId, genericDTO));
    }

    @DeleteMapping
    public void deleteGenericById(int genericId) {
        this.genericService.deleteGenericById(genericId);
    }
}
