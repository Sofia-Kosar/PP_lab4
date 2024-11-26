package com.example.lab4.hotel.managment.service.impl;

import com.example.lab4.hotel.managment.dto.request.ClientDTO;
import com.example.lab4.hotel.managment.entity.Client;
import com.example.lab4.hotel.managment.repository.ClientRepository;
import com.example.lab4.hotel.managment.service.ClientService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

	private final ClientRepository clientRepository;


	public List<ClientDTO> getAllClients() {
		return clientRepository.findAll()
				.stream()
				.map(this::convertToDTO)
				.collect(Collectors.toList());
	}

	public ClientDTO getClientById(Long id) {
		Client client = clientRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Client not found with id: " + id));
		return convertToDTO(client);
	}

	public ClientDTO createClient(ClientDTO clientDTO) {
		Client client = convertToEntity(clientDTO);
		return convertToDTO(clientRepository.save(client));
	}

	public ClientDTO updateClient(Long id, ClientDTO clientDTO) {
		Client existingClient = clientRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Client not found with id: " + id));

		existingClient.setFirstName(clientDTO.getFirstName());
		existingClient.setLastName(clientDTO.getLastName());
		existingClient.setEmail(clientDTO.getEmail());

		return convertToDTO(clientRepository.save(existingClient));
	}

	public void deleteClient(Long id) {
		Client client = clientRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Client not found with id: " + id));
		clientRepository.delete(client);
	}

	@Override
	public Client findUserByEmail(String email) {
		return clientRepository.findByEmail(email)
				.orElseThrow(() -> new RuntimeException("Client not found with email: " + email));
	}

	@Override
	@Transactional
	public void withdrawBalance(String email, BigDecimal totalPrice) {
		Client user = findUserByEmail(email);
		user.setBalance(user.getBalance().subtract(totalPrice));
		clientRepository.save(user);
	}

	private ClientDTO convertToDTO(Client client) {
		return ClientDTO.builder()
				.id(client.getId())
				.firstName(client.getFirstName())
				.lastName(client.getLastName())
				.email(client.getEmail())
				.build();
	}

	private Client convertToEntity(ClientDTO clientDTO) {
		return Client.builder()
				.id(clientDTO.getId())
				.firstName(clientDTO.getFirstName())
				.lastName(clientDTO.getLastName())
				.email(clientDTO.getEmail())
				.build();
	}
}
