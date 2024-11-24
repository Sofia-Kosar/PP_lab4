package com.example.lab4.hotelmanagement.service;

import com.example.lab4.hotelmanagement.repository.AmenityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class  AmenityService {
    private final AmenityRepository amenityRepository;
}