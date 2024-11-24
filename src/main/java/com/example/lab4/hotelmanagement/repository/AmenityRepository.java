package com.example.lab4.hotelmanagement.repository;

import com.example.lab4.hotelmanagement.entity.Amenity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmenityRepository extends JpaRepository<Amenity, Long> {
}