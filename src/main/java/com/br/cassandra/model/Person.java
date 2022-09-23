package com.br.cassandra.model;

import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Person {

	@PrimaryKey
	private UUID id;

	private String name;

	private String age;
	
	public Person(UUID id, String name, String age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	@Deprecated
	public Person() {
	}
}
