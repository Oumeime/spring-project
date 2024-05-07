package com.msservice.drak_api.controller;

import com.msservice.drak_api.model.Villas;
import com.msservice.drak_api.service.VillasService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/Villas")
public class VillasController {
    private final com.msservice.drak_api.service.VillasService VillasService;

    @GetMapping()
    public List<Villas> getAllVillas() {
        return VillasService.getAllVillas();
    }

    @PostMapping()
    public Villas saveVillas(Villas Villas) {
        return VillasService.saveVillas(Villas);
    }
    @GetMapping("/{id}")
    public Villas getVillasById(@PathVariable Long id) {
        return VillasService.getVillasById(id);
    }

    @PostMapping("/update")
    public Villas updateVillas(Villas Villas) {
        return VillasService.updateVillas(Villas);
    }
    @PutMapping("{id}")
    public Villas updateVillas(@PathVariable Long id, @RequestBody Villas Villas) {
        Villas.setId(id);
        return VillasService.updateVillas(Villas);
    }

    @DeleteMapping("{id}")
    public void deletePaiyements(@PathVariable Long id) {
        VillasService.deleteVillas(id);
    }



}
