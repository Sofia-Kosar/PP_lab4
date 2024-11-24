package com.example.lab4.hotelmanagement.repository;

import com.example.lab4.hotelmanagement.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ClientRepository extends JpaRepository<Client, Long> {
}