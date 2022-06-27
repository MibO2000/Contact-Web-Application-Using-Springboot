package com.contact.people.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.people.Entity.People;;

public interface ContactRepository extends JpaRepository<People, Long>{

}
