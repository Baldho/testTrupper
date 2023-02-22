package com.test.example.test.service.impl;

import org.springframework.stereotype.Service;

import com.test.example.test.model.Client;
import com.test.example.test.repository.ClientRepository;
import com.test.example.test.service.ClientService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {
	
	/**
	 * Client Repository.	
	 */
	private ClientRepository clientRepository;
	
	public Client saveClient(Client client) throws Exception {
		if(client == null) {
			throw new Exception("::: The client can't be null");
		}
		try {
			clientRepository.save(client);
		} catch (Exception e) {
			throw new Exception(String.format("::: An error ocurrs saving the client"));
		}		
		return client;
	}
	
	

}
