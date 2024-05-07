package com.msservice.drak_api.service;

import com.msservice.drak_api.model.Paiyements;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiyementsService {
    private final com.msservice.drak_api.repository.PaiyementsRepository PaiyementsRepository;

    public List<Paiyements> getAllPaiyements() {
        return PaiyementsRepository.findAll();
    }
    public Paiyements getPaiyementsById(Long id) {
        return PaiyementsRepository.findById(id).orElse(null);
    }
    public Paiyements savePaiyements(Paiyements Paiyements) {
        return PaiyementsRepository.save(Paiyements);
    }
    public void deletePaiyements(Long id) {
        PaiyementsRepository.deleteById(id);
    }
    public Paiyements updatePaiyements(Paiyements Paiyements) {
        return PaiyementsRepository.save(Paiyements);
    }
}
