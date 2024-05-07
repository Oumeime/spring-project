package com.msservice.drak_api.service;

import com.msservice.drak_api.model.Appartements;
import com.msservice.drak_api.repository.AppartementsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AppartementsService {
    private final com.msservice.drak_api.repository.AppartementsRepository AppartementsRepository;

    public List<Appartements> getAllAppartements() {
        return AppartementsRepository.findAll();
    }
    public Appartements getAppartementsById(Long id) {
        return AppartementsRepository.findById(id).orElse(null);
    }
    public Appartements saveAppartements(Appartements Appartements) {
        return AppartementsRepository.save(Appartements);
    }
    public void deleteAppartements(Long id) {
        AppartementsRepository.deleteById(id);
    }
    public Appartements updateAppartements(Appartements Appartements) {
        return AppartementsRepository.save(Appartements);
    }
}
