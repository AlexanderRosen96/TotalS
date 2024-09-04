package com.example.ptest.controllers;

import com.example.ptest.entites.Person;
import com.example.ptest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/t")
public class PersonControll {

    @Autowired
    private PersonService personService;

    @GetMapping("/person")
    public List<Person> fetchAllPerson(){
        return personService.fetchAllPerson();
    }

    @PostMapping("/add-person")
    public ResponseEntity<String> addPerson (@RequestBody Person person){
        personService.addPerson(person);
        return new ResponseEntity<>("Person is added", HttpStatus.OK);
    }
}
