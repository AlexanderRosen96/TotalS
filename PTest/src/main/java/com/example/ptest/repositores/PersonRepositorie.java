package com.example.ptest.repositores;

import com.example.ptest.entites.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepositorie extends JpaRepository<Person, Integer> {
}
