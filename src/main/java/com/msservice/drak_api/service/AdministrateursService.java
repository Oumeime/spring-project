package com.msservice.drak_api.service;

import com.msservice.drak_api.model.Administrateurs;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AdministrateursService {
    private final com.msservice.drak_api.repository.AdministrateursRepository AdministrateursRepository;

    public List<Administrateurs> getAllAdministrateurs() {
        return AdministrateursRepository.findAll();
    }
    public Administrateurs getAdministrateursById(Long id) {
        return AdministrateursRepository.findById(id).orElse(null);
    }
    public Administrateurs saveAdministrateurs(Administrateurs Administrateurs) {
        return AdministrateursRepository.save(Administrateurs);
    }
    public void deleteAdministrateurs(Long id) {
        AdministrateursRepository.deleteById(id);
    }
    public Administrateurs updateAdministrateurs(Administrateurs Administrateurs) {
        return AdministrateursRepository.save(Administrateurs);
    }
}
