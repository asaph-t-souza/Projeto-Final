package com.t3.springbootbackend.entity;

import java.util.UUID;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "locations")
@Getter @Setter @NoArgsConstructor
public class Location {

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "id", updatable = false)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String district;

    @Column(nullable = false)
    private String street;

    private String complement;

    private int number;

    @Column(name = "location_type")
    private String locationType;

    @Column(name = "accessibility_stars")
    private float accessibilityStars;

    private String description;
    
}
