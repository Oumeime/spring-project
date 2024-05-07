package com.msservice.drak_api.service;

import com.msservice.drak_api.model.Clients;
import com.msservice.drak_api.repository.ClientsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientsService {
    private final ClientsRepository clientsRepository;

    public List<Clients> getAllclients() {
        return clientsRepository.findAll();
    }
    public Clients getclientsById(Long id) {
        return clientsRepository.findById(id).orElse(null);
    }
    public Clients saveclients(Clients clients) {
        return clientsRepository.save(clients);
    }
    public void deleteclients(Long id) {
        clientsRepository.deleteById(id);
    }
    public Clients updateclients(Clients clients) {
        return clientsRepository.save(clients);
    }
}
