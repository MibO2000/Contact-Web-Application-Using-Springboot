package com.contact.people;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PeopleApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PeopleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
