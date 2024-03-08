package com.kemisch.paymentgenerator.repositories;

import com.kemisch.paymentgenerator.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findAllByUser(Long user);
}
