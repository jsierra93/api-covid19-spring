package com.co.jsierra.apicovid19.controller;

import com.co.jsierra.apicovid19.model.Country;
import com.co.jsierra.apicovid19.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CovidController {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping("/")
    public String inicializar(){
        System.out.println("Se inicializa el microservicio");
        return "Ejecutando correctamente en puerto 8001";
    }

    @GetMapping("/country")
    public List<Country> getCountry(){
        Country country = Country.builder().id(Long.valueOf(1)).country("Colombia").description("Colombia").codCountry("CO").build();
        List<Country> list = countryRepository.findAll();
        return list;
    }

}
