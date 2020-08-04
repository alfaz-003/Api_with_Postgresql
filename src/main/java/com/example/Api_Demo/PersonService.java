package com.example.Api_Demo;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Api_Demo.Person;


@Service
public class PersonService {
	
	@Autowired
	PersonRepository personRepository;
	
	
	//get all person data
	
	public List<Person> getAllPerson()   
	{  
	List<Person> person = new ArrayList<Person>();  
	personRepository.findAll().forEach(person1 -> person.add(person1));  
	return personRepository.findAll(); 
	}  
	
	
	//get person by id
	
	public Person getPersonById(int id)   
	{  
	return personRepository.findById(id).get();  
	}  
	
	
	//saving a specific person by using the method save()   
	
	public void saveOrUpdate(Person person)   
	{  
	personRepository.save(person);  
	}  
	
	
	
	
	//deleting a person
	
	
	public void delete(int id)   
	{  
	personRepository.deleteById(id);  
	}  
	
	
	
	//updating a person's data
	
	
	public void update(Person person, int id)   
	{  
	personRepository.save(person);  
	}  
	

}
