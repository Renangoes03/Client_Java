package com.fatec.client.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.client.entities.Client;

@RestController
public class ClientController {

    @GetMapping("client")
    public Client getClient() {
        Client c = new Client();
        c.setId(0);
        c.setEmail("joao@gmail.com");
        c.setName("João Silva");

        return c;

    }

    @GetMapping("clients")
    public List<Client> getClients() {
        List <Client>clients = new ArrayList<Client>();
        return clients;

    }

}
