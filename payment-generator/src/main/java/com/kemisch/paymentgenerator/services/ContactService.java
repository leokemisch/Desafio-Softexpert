package com.kemisch.paymentgenerator.services;

import com.kemisch.paymentgenerator.domain.Contact;
import com.kemisch.paymentgenerator.repositories.ContactRepository;
import com.kemisch.paymentgenerator.services.exceptions.DataIntegrityException;
import com.kemisch.paymentgenerator.services.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    ContactRepository repository;

    public Contact insert(Contact contact) {
        return repository.save(contact);
    }

    public List<Contact> findAllByUser(Long user) {
        return repository.findAllByUser(user);
    }

    public Contact findById(Long id) {
        Optional<Contact> contact = repository.findById(id);
        return contact.orElseThrow(() -> new NotFoundException("Object not found! Id: " + id + ", type: " + Contact.class.getName()));
    }

    public Contact update(Contact contact) {
        return repository.save(contact);
    }

    public void delete(Long id) {
        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DataIntegrityException("It is not possible to delete because there's related entity.");
        }
    }
}
