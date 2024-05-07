package com.msservice.drak_api.controller;

import com.msservice.drak_api.model.Clients;
import com.msservice.drak_api.service.ClientsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/clients")
public class ClientsController {
    private final ClientsService clientsService;

    @GetMapping()
    public List<Clients> getAllclients() {
        return clientsService.getAllclients();
    }

    @PostMapping()
    public Clients saveclients(Clients clients) {
        return clientsService.saveclients(clients);
    }
    @GetMapping("/{id}")
    public Clients getclientsById(@PathVariable Long id) {
        return clientsService.getclientsById(id);
    }

    @PostMapping("/update")
    public Clients updateclients(Clients clients) {
        return clientsService.updateclients(clients);
    }
    @PutMapping("{id}")
    public Clients updateclients(@PathVariable Long id, @RequestBody Clients clients) {
        clients.setId(id);
        return clientsService.updateclients(clients);
    }

    @DeleteMapping("{id}")
    public void deleteclients(@PathVariable Long id) {
        clientsService.deleteclients(id);
    }


}
