package com.kemisch.paymentgenerator.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
@JsonIgnoreProperties(value = {"password", "creation"})
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String email;
    String password;
    Date creation;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    List<Contact> contacts;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    List<Payment> payments;

    @PrePersist
    public void prePersist() {
        creation = new Date();
    }
}
