package com.example.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();
	public PersonService() {
		Person p = new Person();
		p.setId("1");
		p.setAge(20);
		p.setFirstName("Manal");
		p.setLastName("ECHIHEB");
		persons.add(p);

		p = new Person();
		p.setId("2");
		p.setAge(20);
		p.setFirstName("Aya");
		p.setLastName("FATENE");
		persons.add(p);
		
		p = new Person();
		p.setId("3");
		p.setAge(20);
		p.setFirstName("Soukaina");
		p.setLastName("CHERAJ");
		persons.add(p);
		
		p = new Person();
		p.setId("4");
		p.setAge(21);
		p.setFirstName("Oumaima");
		p.setLastName("N'ICHA");
		persons.add(p);
		
		p = new Person();
		p.setId("5");
		p.setAge(25);
		p.setFirstName("webhook");
		p.setLastName("testJenjinsJob");
		persons.add(p);
		
	}
	public Person getPerson(String id) {
		for(Person person:persons) {
			if(person.getId().equalsIgnoreCase(id)) return person;
		}
	    return null;
	}
	public ArrayList<Person> getAll() {
		return persons;
	}
}

