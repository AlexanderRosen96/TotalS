package com.example.ptest.service;

import com.example.ptest.entites.Person;

import java.util.List;

public interface PersonServiceInteface {

    Person addPerson (Person person);

    List<Person> fetchAllPerson();
}
