package com.contact.people.Service;

import java.util.List;

import com.contact.people.Entity.People;

public interface ContactService {
    List<People> getAllContact();
	
	People saveContact(People people);
	
	People getContactById(Long id);
	
	People updateContact(People people);
	
	void deleteContactById(Long id);
}
