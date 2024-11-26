package com.example.lab4.hotel.managment.controller;

import com.example.lab4.hotel.managment.dto.request.ClientDTO;
import com.example.lab4.hotel.managment.service.ClientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/clients")
@RequiredArgsConstructor
public class ClientController {

	private final ClientService clientService;

	@GetMapping("/{id}")
	public ResponseEntity<ClientDTO> getClientById(@PathVariable Long id) {
		return ResponseEntity.ok(clientService.getClientById(id));
	}

	@PostMapping
	public ResponseEntity<ClientDTO> createClient(@Valid @RequestBody ClientDTO clientDTO) {
		return ResponseEntity.ok(clientService.createClient(clientDTO));
	}

	@PutMapping("/{id}")
	public ResponseEntity<ClientDTO> updateClient(@PathVariable Long id, @Valid @RequestBody ClientDTO clientDTO) {
		return ResponseEntity.ok(clientService.updateClient(id, clientDTO));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteClient(@PathVariable Long id) {
		clientService.deleteClient(id);
		return ResponseEntity.noContent().build();
	}
}
