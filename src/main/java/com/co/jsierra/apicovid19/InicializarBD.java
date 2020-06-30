package com.co.jsierra.apicovid19;

import com.co.jsierra.apicovid19.model.Country;
import com.co.jsierra.apicovid19.repository.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InicializarBD {
    private static final Logger log = LoggerFactory.getLogger(InicializarBD.class);

    @Bean
    CommandLineRunner initDatabase(CountryRepository repository) {
        return args -> {
            log.info("Precargando "+ repository.save(Country.builder().country("Colombia").description("Colombia").codCountry("CO").build()));
            log.info("Precargando "+ repository.save(Country.builder().country("Albania").description("Albania").codCountry("AL").build()));
        };
    }
}
