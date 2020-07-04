package com.co.jsierra.apicovid19.repository;

import com.co.jsierra.apicovid19.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
