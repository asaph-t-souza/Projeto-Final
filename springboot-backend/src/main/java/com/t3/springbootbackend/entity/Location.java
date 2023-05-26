package com.t3.springbootbackend.entity;

import java.util.HashSet;
import java.util.Set;
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

    @OneToMany(mappedBy = "location")
    private Set<Review> myReviews = new HashSet<>();

    public Location(String name, String cep, String country, String state, String city, String district, String street,
            String complement, int number, String locationType, float accessibilityStars, String description) {
        this.name = name;
        this.cep = cep;
        this.country = country;
        this.state = state;
        this.city = city;
        this.district = district;
        this.street = street;
        this.complement = complement;
        this.number = number;
        this.locationType = locationType;
        this.accessibilityStars = accessibilityStars;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Location [id=" + id + ", name=" + name + ", cep=" + cep + ", country=" + country + ", state=" + state
                + ", city=" + city + ", district=" + district + ", street=" + street + ", complement=" + complement
                + ", number=" + number + ", locationType=" + locationType + ", accessibilityStars=" + accessibilityStars
                + ", description=" + description + "]";
    }

    
    
}
