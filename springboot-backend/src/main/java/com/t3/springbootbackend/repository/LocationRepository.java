package com.t3.springbootbackend.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.t3.springbootbackend.entity.Location;

public interface LocationRepository extends JpaRepository<Location, UUID>{
    
    List<Location> findByNameContains(String name);

    List<Location> findByCity(String city);

}
