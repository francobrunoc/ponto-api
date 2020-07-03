package com.empresa.ponto.control;

import com.empresa.ponto.model.entity.Client;
import com.empresa.ponto.repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/list")
    public Iterable<Client> list() {
        return clientRepository.findAll();
    }

    @PostMapping("/save")
    public Client save(@RequestBody Client client) {
        return this.clientRepository.save(client);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        clientRepository.deleteById(id);
    }

}
