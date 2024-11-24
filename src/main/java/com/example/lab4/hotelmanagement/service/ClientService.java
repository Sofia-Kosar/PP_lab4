package com.example.lab4.hotelmanagement.service;

import com.example.lab4.hotelmanagement.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;
}