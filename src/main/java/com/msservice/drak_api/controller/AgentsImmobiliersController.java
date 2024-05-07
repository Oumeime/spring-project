package com.msservice.drak_api.controller;

import com.msservice.drak_api.model.AgentsImmobiliers;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/AgentsImmobiliers")
public class AgentsImmobiliersController {
    private final com.msservice.drak_api.service.AgentsImmobiliersService AgentsImmobiliersService;

    @GetMapping()
    public List<AgentsImmobiliers> getAllAgentsImmobiliers() {
        return AgentsImmobiliersService.getAllAgentsImmobiliers();
    }

    @PostMapping()
    public AgentsImmobiliers saveAgentsImmobiliers(AgentsImmobiliers AgentsImmobiliers) {
        return AgentsImmobiliersService.saveAgentsImmobiliers(AgentsImmobiliers);
    }
    @GetMapping("/{id}")
    public AgentsImmobiliers getAgentsImmobiliersById( @PathVariable Long id) {
        return AgentsImmobiliersService.getAgentsImmobiliersById(id);
    }

    @PostMapping("/update")
    public AgentsImmobiliers updateAgentsImmobiliers(AgentsImmobiliers AgentsImmobiliers) {
        return AgentsImmobiliersService.updateAgentsImmobiliers(AgentsImmobiliers);
    }
    @PutMapping("{id}")
    public AgentsImmobiliers updateAgentsImmobiliers(@PathVariable Long id, @RequestBody AgentsImmobiliers AgentsImmobiliers) {
        AgentsImmobiliers.setId(id);
        return AgentsImmobiliersService.updateAgentsImmobiliers(AgentsImmobiliers);
    }

    @DeleteMapping("{id}")
    public void deleteAgentsImmobiliers(@PathVariable Long id) {
        AgentsImmobiliersService.deleteAgentsImmobiliers(id);
    }
}
