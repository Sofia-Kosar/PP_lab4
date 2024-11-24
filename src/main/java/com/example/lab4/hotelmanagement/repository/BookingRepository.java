package com.example.lab4.hotelmanagement.repository;

import com.example.lab4.hotelmanagement.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}