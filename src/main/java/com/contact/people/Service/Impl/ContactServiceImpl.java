package com.contact.people.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.contact.people.Entity.People;
import com.contact.people.Repository.ContactRepository;
import com.contact.people.Service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

    private ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void deleteContactById(Long id) {
        contactRepository.deleteById(id);
    }

    @Override
    public List<People> getAllContact() {
        return contactRepository.findAll();
    }

    @Override
    public People getContactById(Long id) {
        return contactRepository.findById(id).get();
    }

    @Override
    public People saveContact(People people) {
        return contactRepository.save(people);
    }

    @Override
    public People updateContact(People people) {
        return contactRepository.save(people);
    }
    
}
