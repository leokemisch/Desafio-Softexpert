package com.kemisch.paymentgenerator.repositories;

import com.kemisch.paymentgenerator.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
