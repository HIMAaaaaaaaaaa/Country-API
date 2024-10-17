package com.example.demo.entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//import jakarta.persistence.*;

//import javax.persistence.Table;

//import org.springframework.boot.autoconfigure.domain.EntityScan;

//@jakarta.persistence.Entity
//@EntityScan
//@Entity
//@Table(name = "DEPARTMENTS")
//@Document(collection = "DEPARTMENTS")
@EntityScan(basePackages = "com.example.demo.entity")
@Entity
@Table(name = "DEPARTMENTS")
public class CountryEntity implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(nullable = false, updatable = false)
private static final long serialVersionUID = -2435172566430050531L;
private int	REGION_ID ;
private String COUNTRY_NAME;  
private String	COUNTRY_ID;
public int getREGION_ID() {
	return REGION_ID;
}
public void setREGION_ID(int rEGION_ID) {
	REGION_ID = rEGION_ID;
}
public String getCOUNTRY_NAME() {
	return COUNTRY_NAME;
}
public void setCOUNTRY_NAME(String cOUNTRY_NAME) {
	COUNTRY_NAME = cOUNTRY_NAME;
}
public String getCOUNTRY_ID() {
	return COUNTRY_ID;
}
public void setCOUNTRY_ID(String cOUNTRY_ID) {
	COUNTRY_ID = cOUNTRY_ID;
}
public static long getSerialversionuid() {
	return serialVersionUID;
} 





}
