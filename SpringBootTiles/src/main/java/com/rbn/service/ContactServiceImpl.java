package com.rbn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbn.DAO.ContactDao;
import com.rbn.model.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactDao contactDao;

	@Override
	public void saveContact(Contact contact) {
		contactDao.saveContact(contact);
	}
}
