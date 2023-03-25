package com.example.demo.service;

import com.example.demo.model.Client;

import java.util.List;

public interface ClientService {

    Client create(Client client);

    Client update(Client client);

    Client findByDocument(Integer document);

    List<Client> findAll();

    void delete(Integer document);
}
