package com.msservice.drak_api.service;

import com.msservice.drak_api.model. AgentsImmobiliers;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AgentsImmobiliersService {
    private final com.msservice.drak_api.repository. AgentsImmobiliersRepository  AgentsImmobiliersRepository;

    public List<AgentsImmobiliers> getAllAgentsImmobiliers() {
        return  AgentsImmobiliersRepository.findAll();
    }
    public  AgentsImmobiliers getAgentsImmobiliersById(Long id) {
        return  AgentsImmobiliersRepository.findById(id).orElse(null);
    }
    public AgentsImmobiliers saveAgentsImmobiliers(AgentsImmobiliers AgentsImmobiliers) {
        return AgentsImmobiliersRepository.save(AgentsImmobiliers);
    }
    public void deleteAgentsImmobiliers(Long id) {
        AgentsImmobiliersRepository.deleteById(id);
    }
    public AgentsImmobiliers updateAgentsImmobiliers(AgentsImmobiliers AgentsImmobiliers) {
        return AgentsImmobiliersRepository.save(AgentsImmobiliers);
    }
}
