package com.br.cassandra.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.cassandra.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, UUID> {
}
