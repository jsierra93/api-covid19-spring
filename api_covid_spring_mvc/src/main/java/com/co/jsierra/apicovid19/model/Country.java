package com.co.jsierra.apicovid19.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Country {

    private @Id
    @GeneratedValue
    Long id;
    private String country;
    private String description;
    private String codCountry;
}
