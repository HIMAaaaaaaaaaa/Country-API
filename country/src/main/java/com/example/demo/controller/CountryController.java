package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.CountryEntity;
import com.example.demo.repository.CountryRepository;
import com.example.demo.service.CountryService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
@EntityScan(basePackages = "com.example.demo.entity")
public class CountryController {
	private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public <Country> List<CountryRepository> selectAllCountries() {
        return countryService.selectAllCountries();
    }

    @GetMapping("/{countryId}")
    public <Country> CountryService selectCountryById(@PathVariable String countryId) {
        Optional<CountryService> country = countryService.selectCountryById(countryId);
        return country.orElse(null); // You can return an appropriate response if not found
    }

    @PostMapping
    public <Country> Country addCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }

    @PutMapping("/{countryId}")
    public <Country> Country updateCountry(@PathVariable String countryId, @RequestBody Country updatedCountry) {
        return countryService.updateCountry(countryId, updatedCountry);
    }

    @DeleteMapping("/{countryId}")
    public void deleteCountry(@PathVariable String countryId) {
        countryService.deleteCountry(countryId);
    }

    @GetMapping("/find")
    public <Country> Optional<CountryService> findCountriesById(@RequestParam String countryId) {
        return countryService.findCountriesById(countryId);
    }
}
