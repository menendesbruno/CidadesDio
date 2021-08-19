package com.github.menendesbruno.citiesapi.repository;

import com.github.menendesbruno.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
