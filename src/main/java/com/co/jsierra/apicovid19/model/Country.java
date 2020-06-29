package com.co.jsierra.apicovid19.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.annotation.Documented;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    private String country;
    private String description;
    private String codCountry;
}
