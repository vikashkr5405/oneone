package com.example.oneone;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name="Person")
public class Person {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String name;
int age;

@OneToOne(cascade=CascadeType.ALL)
Address address;

public Person()
{
	super();
}

public Person(int id,String name,int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

}
