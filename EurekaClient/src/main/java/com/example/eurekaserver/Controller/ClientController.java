package com.example.eurekaserver.Controller;


import com.example.eurekaserver.Entities.Client;
import com.example.eurekaserver.Repositories.ClientRepository;
import com.example.eurekaserver.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/client")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@GetMapping
	public List findAll() {
		return clientRepository.findAll();
	}

	@GetMapping("/{id}")
	public Client findById (@PathVariable Long id) throws Exception{

		 return this.clientRepository.findById(id).orElseThrow(()-> new
				Exception("Client inexistnt"));
		 }

	@PostMapping
	public void save(@RequestBody Client client){
		clientService.addClient(client);
	}
}