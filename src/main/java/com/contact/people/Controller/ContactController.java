package com.contact.people.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.contact.people.Entity.People;
import com.contact.people.Service.ContactService;

@Controller
public class ContactController {
    private ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }
    @GetMapping("/contact")
	public String listPeople(Model model) {
		model.addAttribute("people", contactService.getAllContact());
		return "people";
	}
    @GetMapping("/contact/new")
	public String createContactForm(Model model) {
		
		People people = new People();
		model.addAttribute("people", people);
		return "create_contact";
		
	}
	
	@PostMapping("/contact")
	public String saveContact(@ModelAttribute("people") People people) {
		contactService.saveContact(people);
		return "redirect:/contact";
	}
	
	@GetMapping("/contact/edit/{id}")
	public String editContact(@PathVariable Long id, Model model) {
		model.addAttribute("people", contactService.getContactById(id));
		return "edit_contact";
	}

	@PostMapping("/contact/{id}")
	public String updateContact(@PathVariable Long id,
			@ModelAttribute("people") People people,
			Model model) {
		
		// get student from database by id
		People existingContact = contactService.getContactById(id);
		existingContact.setId(id);
		existingContact.setFirstName(people.getFirstName());
		existingContact.setLastName(people.getLastName());
		existingContact.setEmail(people.getEmail());
		existingContact.setPhnum(people.getPhnum());
		
		// save updated student object
		contactService.updateContact(existingContact);
		return "redirect:/contact";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/contact/{id}")
	public String deleteStudent(@PathVariable Long id) {
		contactService.deleteContactById(id);
		return "redirect:/contact";
	}

}
