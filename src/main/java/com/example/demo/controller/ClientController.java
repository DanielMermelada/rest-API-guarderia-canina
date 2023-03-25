package com.example.demo.controller;
import com.example.demo.model.Client;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> findAll(){
        return clientService.findAll();
    }
    @PostMapping
    public Client create(@RequestBody Client client){
        return clientService.create(client);
    }
    @PutMapping
    public Client update(@RequestBody Client client){
        return  clientService.update(client);
    }
    @GetMapping("/{document}")
    public Client findByDocument(@PathVariable Integer document){
        return clientService.findByDocument(document);
    }
    @DeleteMapping("/{document}")
    public void delete(@PathVariable Integer document){
        clientService.delete(document);
    }
}
