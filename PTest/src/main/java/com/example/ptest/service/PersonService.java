package com.example.ptest.service;

import com.example.ptest.entites.Person;
import com.example.ptest.repositores.PersonRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements PersonServiceInteface{

    @Autowired
    private PersonRepositorie personRepositorie;

    @Override
    public Person addPerson(Person person) {
        personRepositorie.save(person);
        return person;
    }

    @Override
    public List<Person> fetchAllPerson() {
        return personRepositorie.findAll();
    }


}
