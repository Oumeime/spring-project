package com.msservice.drak_api.controller;

import com.msservice.drak_api.model.Appartements;
import com.msservice.drak_api.service.AppartementsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/Appartements")
public class AppartementsController {
    private final com.msservice.drak_api.service.AppartementsService AppartementsService;

    @GetMapping()
    public List<Appartements> getAllAppartements() {
        return AppartementsService.getAllAppartements();
    }

    @PostMapping()
    public Appartements saveAppartements(Appartements Appartements) {
        return AppartementsService.saveAppartements(Appartements);
    }
    @GetMapping("/{id}")
    public Appartements getAppartementsById(@PathVariable Long id) {
        return AppartementsService.getAppartementsById(id);
    }

    @PostMapping("/update")
    public Appartements updateAppartements(Appartements Appartements) {
        return AppartementsService.updateAppartements(Appartements);
    }
    @PutMapping("{id}")
    public Appartements updateAppartements(@PathVariable Long id, @RequestBody Appartements Appartements) {
        Appartements.setId(id);
        return AppartementsService.updateAppartements(Appartements);
    }

    @DeleteMapping("{id}")
    public void deleteAppartements(@PathVariable Long id) {
        AppartementsService.deleteAppartements(id);
    }
}
