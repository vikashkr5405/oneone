package com.example.oneone;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="Address")
public class Address {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String city;
String country;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
