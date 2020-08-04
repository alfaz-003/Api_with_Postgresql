package com.example.Api_Demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Api_Demo.Person;





@RestController
public class PersonController {
	
	
	@Autowired  
	PersonService personService;  
	
	
	
	//get method   
	@GetMapping("/persons")  
	private List<Person> getAllPerson()   
	{  
	return personService.getAllPerson();  
	}  
	
	
	
	//get method for only one person
	
	@GetMapping("/person/{id}")  
	private Person getPerson(@PathVariable("id") int id)   
	{  
	return personService.getPersonById(id);  
	}  
	
	
	//Delete persons record
	
	
	@DeleteMapping("/person/{id}")  
	private void deletePerson(@PathVariable("id") int id)   
	{  
	personService.delete(id);  
	}  
	
	
	
	
	//post method 
	@PostMapping("/persons")  
	private int savePerson(@RequestBody Person person)   
	{  
	personService.saveOrUpdate(person);  
	return person.getId();
	}  



	//Update person
	@PutMapping("/person")  
	private Person update(@RequestBody Person person)   
	{  
	personService.saveOrUpdate(person);  
	return person;  
	}  

	

}
