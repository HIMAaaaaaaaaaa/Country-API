package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CountryEntity;
import com.example.demo.repository.CountryRepository;


import java.util.List;
import java.util.Optional;


@Service
public class CountryService {
	private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<CountryRepository> selectAllCountries() {
        return countryRepository.findAll();
    }

    public Optional<CountryService> selectCountryById(String countryId) {
        return countryRepository.findById(countryId);
    }

    public CountryService addCountry(CountryService country) {
        return countryRepository.save(country);
    }

    public <Country> CountryService updateCountry(String countryId, CountryService updatedCountry) {
        Optional<CountryService> existingCountry = countryRepository.findById(countryId);
        if (existingCountry.isPresent()) {
            updatedCountry.setCOUNTRY_ID(countryId);
            return countryRepository.save(updatedCountry);
        }
        return null; // You can handle the not found scenario differently
    }

    private void setCOUNTRY_ID(String countryId) {
		// TODO Auto-generated method stub
		
	}

	public void deleteCountry(String countryId) {
        countryRepository.deleteById(countryId);
    }

    public <Country> Optional<CountryService> findCountriesById(String countryId) {
        return countryRepository.findById(countryId);
    }

	public <Country> Country addCountry(Country country) {
		// TODO Auto-generated method stub
		return null;
	}

	public <Country> Country updateCountry(String countryId, Country updatedCountry) {
		// TODO Auto-generated method stub
		return null;
	}
}
