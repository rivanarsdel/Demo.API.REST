package dev.RIV.Demo.API.REST.SpringDooters;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean ModelMapper modelMapper() {return new ModelMapper();}
}
