package com.msservice.drak_api.controller;

import com.msservice.drak_api.model.Administrateurs;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/Administrateurs")
public class AdministrateursController {
    private final com.msservice.drak_api.service.AdministrateursService AdministrateursService;

    @GetMapping()
    public List<Administrateurs> getAllAdministrateurs() {
        return AdministrateursService.getAllAdministrateurs();
    }

    @PostMapping()
    public Administrateurs saveAdministrateurs(Administrateurs Administrateurs) {
        return AdministrateursService.saveAdministrateurs(Administrateurs);
    }
    @GetMapping("/{id}")
    public Administrateurs getAdministrateursById(@PathVariable Long id) {
        return AdministrateursService.getAdministrateursById(id);
    }

    @PostMapping("/update")
    public Administrateurs updateAdministrateurs(Administrateurs Administrateurs) {
        return AdministrateursService.updateAdministrateurs(Administrateurs);
    }
    @PutMapping("/{id}")
    public Administrateurs updateAdministrateurs(@PathVariable Long id, @RequestBody Administrateurs Administrateurs) {
        Administrateurs.setId(id);
        return AdministrateursService.updateAdministrateurs(Administrateurs);
    }

    @DeleteMapping("{id}")
    public void deleteAdministrateurs(@PathVariable Long id) {
        AdministrateursService.deleteAdministrateurs(id);
    }
}
