package com.kemisch.paymentgenerator.repositories;

import com.kemisch.paymentgenerator.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
