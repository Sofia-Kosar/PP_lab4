package com.example.lab4.hotel.managment.service;

import com.example.lab4.hotel.managment.dto.request.ClientDTO;
import com.example.lab4.hotel.managment.entity.Client;

import java.math.BigDecimal;
import java.util.List;

public interface ClientService {

	List<ClientDTO> getAllClients();

	ClientDTO getClientById(Long id);

	ClientDTO createClient(ClientDTO clientDTO);

	ClientDTO updateClient(Long id, ClientDTO clientDTO);

	void deleteClient(Long id);

	Client findUserByEmail(String email);

	void withdrawBalance(String email, BigDecimal totalPrice);
}
