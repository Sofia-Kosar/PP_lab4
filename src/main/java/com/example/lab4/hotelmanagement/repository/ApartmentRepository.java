package com.example.lab4.hotelmanagement.repository;

import com.example.lab4.hotelmanagement.entity.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
}