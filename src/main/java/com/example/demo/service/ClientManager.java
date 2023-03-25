package com.example.demo.service;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@Service
public class ClientManager implements ClientService {

    @Autowired
    private ClientsRepository clientRepo;

    @Override
    public Client create(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public Client update(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public Client findByDocument(Integer document) {
        Optional<Client> optionalClient = clientRepo.findById(document);
        return optionalClient.orElse(null);
    }

    @Override
    public List<Client> findAll() {
        return clientRepo.findAll();
    }

    @Override
    public void delete(Integer document) {
        clientRepo.deleteById(document);
    }
}
