package com.msservice.drak_api.controller;
import com.msservice.drak_api.model.Appartements;
import com.msservice.drak_api.model.Paiyements;
import com.msservice.drak_api.service.PaiyementsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/api/Paiyements")
public class PaiyementsController {
    private final PaiyementsService PaiyementsService;
    @GetMapping()
    public List<Paiyements> getAllPaiyements() {
        return PaiyementsService.getAllPaiyements();
    }
    @PostMapping()
    public Paiyements savePaiyements(Paiyements Paiyements) {
        return PaiyementsService.savePaiyements(Paiyements);
    }
    @GetMapping("/{id}")
    public Paiyements getPaiyementsById(@PathVariable Long id) {
        return PaiyementsService.getPaiyementsById(id);
    }

    @PostMapping("/update")
    public Paiyements updatePaiyements(Paiyements Paiyements) {
        return PaiyementsService.updatePaiyements(Paiyements);
    }
    @PutMapping("{id}")
    public Paiyements updatePaiyements(@PathVariable Long id, @RequestBody Paiyements Paiyements) {
        Paiyements.setId(id);
        return PaiyementsService.updatePaiyements(Paiyements);
    }

    @DeleteMapping("{id}")
    public void deletePaiyements(@PathVariable Long id) {
        PaiyementsService.deletePaiyements(id);
    }


}
