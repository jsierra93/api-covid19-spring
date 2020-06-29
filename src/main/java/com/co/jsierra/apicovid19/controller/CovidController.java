package com.co.jsierra.apicovid19.controller;

import com.co.jsierra.apicovid19.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CovidController {

    @GetMapping("/")
    public String inicializar(){
        System.out.println("Se inicializa el microservicio");
        return "Ejecutando puerto";
    }

    @GetMapping("/country")
    public Country getCountry(){
        Country country = Country.builder().country("Colombia").description("Colombia").codCountry("CO").build();
        return country;
    }

}
