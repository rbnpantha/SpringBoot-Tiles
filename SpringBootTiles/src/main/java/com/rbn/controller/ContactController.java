package com.rbn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rbn.model.Contact;
import com.rbn.service.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;

	@RequestMapping(value ={"/","/home"}, method = RequestMethod.GET)
	public String home() {
		return "homepage";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contactPage() {
		return "contactpage";
	}

	@RequestMapping(value = "/saveContact", method = RequestMethod.POST)
	@ResponseBody
	public String saveContact(@RequestParam(value = "name") String name,
			@RequestParam(value = "address") String address, @RequestParam(value = "phone") String phone/*
																										 * HttpServletRequest
																										 * request
																										 */) {
		System.out.println("name : " + name + ", address : " + address + ", phone : " + phone);
		// or using HttpServletRequest, System.out.println("name : " +
		// request.getParameter("name"));

		// create contact object
		Contact contact = new Contact();
		contact.setContactName(name);
		contact.setContactAddress(address);
		contact.setContactPhone(phone);

		// save contact to database
		contactService.saveContact(contact);

		return "Contact successfully saved";
	}

}
