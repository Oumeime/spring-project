package com.msservice.drak_api.service;

import com.msservice.drak_api.model.Villas;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VillasService {
    private final com.msservice.drak_api.repository.VillasRepository VillasRepository;

    public List<Villas> getAllVillas() {
        return VillasRepository.findAll();
    }
    public Villas getVillasById(Long id) {
        return VillasRepository.findById(id).orElse(null);
    }
    public Villas saveVillas(Villas Villas) {
        return VillasRepository.save(Villas);
    }
    public void deleteVillas(Long id) {
        VillasRepository.deleteById(id);
    }
    public Villas updateVillas(Villas Villas) {
        return VillasRepository.save(Villas);
}
}