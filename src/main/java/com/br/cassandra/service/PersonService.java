package com.br.cassandra.service;

import com.br.cassandra.model.Person;
import com.br.cassandra.repository.PersonRepository;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public Iterable<Person> getPersons() {
        return personRepository.findAll();
    }

    public Optional<Person> getPersonById(UUID id) {
        return personRepository.findById(id);
    }
}
