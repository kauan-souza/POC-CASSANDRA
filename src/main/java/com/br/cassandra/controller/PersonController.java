package com.br.cassandra.controller;

import com.br.cassandra.model.Person;
import com.br.cassandra.service.PersonService;
import java.util.Optional;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        return new ResponseEntity<>(personService.createPerson(person), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<Iterable<Person>> getPersons() {
        return ResponseEntity.ok(personService.getPersons());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Person>> getPersonById(@PathVariable("id") UUID id) {
        return ResponseEntity.ok(personService.getPersonById(id));
    }

} 