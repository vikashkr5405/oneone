package com.example.oneone;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
@Autowired
PersonRepository prepo;

@Autowired
AddressRepository arepo;

@RequestMapping("/save")
public String sad()
{
	Person p=new Person();
	p.setName("vishal");
	p.setAge(33);
	
	Address a=new Address();
	a.setCity("dehradun");
	a.setCountry("india");
	
	p.setAddress(a);
	prepo.save(p);
	return "data saved....!";
}

@RequestMapping("/saveall")
public String saveall()
{
	Person p1=new Person();
	p1.setName("mukesh gupta");
	p1.setAge(19);
	Address a1=new Address();
	a1.setCity("patna");
	a1.setCountry("india");
	p1.setAddress(a1);
	
	Person p2=new Person();
	p2.setName("mukesh shrma");
	p2.setAge(22);
	Address a2=new Address();
	a2.setCity("gaziabad");
	a2.setCountry("india");
	p2.setAddress(a2);
	
	Person p3=new Person();
	p3.setName("raju kumar");
	p3.setAge(21);
	Address a3=new Address();
	a3.setCity("luckhnow");
	a3.setCountry("india");
	p3.setAddress(a3);
	
	Person p4=new Person();
	p4.setName("abhishek singh");
	p4.setAge(21);
	Address a4=new Address();
	a4.setCity("bokaro");
	a4.setCountry("india");
	p4.setAddress(a4);
	
	Person p5=new Person();
	p5.setName("sonu verma");
	p5.setAge(16);
	Address a5=new Address();
	a5.setCity("dhanbad");
	a5.setCountry("india");
	p5.setAddress(a5);
	
	List<Person> list=Arrays.asList(p1,p2,p3,p4,p5);
	prepo.saveAll(list);
	return "all data are saved in the created tables........!";
}
@RequestMapping("/all")
public List<Person> all()
{
	return  prepo.findAll();
}

@RequestMapping("/aall")
public List<Address> aall()
{
	return arepo.findAll();
}
/*@RequestMapping("/an/{id}")
public Person1 at(@PathVariable int id)
{
	return prepo.showById(id);
}*/
@RequestMapping("/{id}")
public Person1 gh(@PathVariable int id)
{
	return prepo.forId(id);
}
@RequestMapping("/to/{name}")
public Person gjk(@PathVariable String name)
{
	return prepo.findByNameLike(name);
}
@RequestMapping("/by/{name}")
public Person yhj(@PathVariable String name)
{
	return prepo.findByNameContains(name);
}
}
