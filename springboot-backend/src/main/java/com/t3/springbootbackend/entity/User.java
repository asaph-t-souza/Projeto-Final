package com.t3.springbootbackend.entity;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "id", updatable = false)
    private UUID id;

    private String username;

    private String password;

    private String email;

    private String firstName;

    private String lastName;

    




    
}
