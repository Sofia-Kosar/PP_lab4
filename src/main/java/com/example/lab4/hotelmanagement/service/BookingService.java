package com.example.lab4.hotelmanagement.service;

import com.example.lab4.hotelmanagement.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingService {
    private final BookingRepository bookingRepository;
}