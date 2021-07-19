package com.hussain.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hussain.location.entities.Client;

import com.hussain.location.repos.ClientRepository;


@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository repos;
	
	@Override
	public Client saveClient(Client client) {
		
		return repos.save(client);
	}

	@Override
	public Client updateClient(Client client) {
		
		return repos.save(client);
	}

	@Override
	public void deleteClient(Client client) {
		
		repos.delete(client);
	}

	@Override
	public Client getClientById(Long id) {
	
		Client client = new Client();
		client = repos.findById(id).get();
		return client;
	}

	@Override
	public List<Client> getAllClients() {
		List<Client> allClients = repos.findAll();
		return allClients;
	}

}
