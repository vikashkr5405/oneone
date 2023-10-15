package com.example.oneone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonRepository extends JpaRepository<Person,Integer>
{

	//@Query("select new com.example.oneone.Person1(e.id,e.name) from Person e where e.id=?1")
	//Person1 showById(int id);

	@Query("select new com.example.oneone.Person1(e.id,e.name,e.age,e.address.city) from Person e where e.id=?1")
    Person1 forId(int id);
	
	Person findByNameLike(String name);
	Person findByNameContains(String name);
}
