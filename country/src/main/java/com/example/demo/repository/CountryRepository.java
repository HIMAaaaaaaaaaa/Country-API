package com.example.demo.repository;
import java.util.Optional;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.service.CountryService;
//import com.example.demo.entity.CountryRepository;
@Repository
@EntityScan(basePackages = "com.example.demo.entity")

public interface CountryRepository extends JpaRepository<CountryRepository, Long> {

	Optional<CountryService> findById(String countryId);
	    // You can define custom queries here if needed

	CountryService save(CountryService country);

	void deleteById(String countryId);
}
