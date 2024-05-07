package com.msservice.drak_api.controller;

import com.msservice.drak_api.model.Maisons;
import com.msservice.drak_api.service.HouseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/house")
public class HousesController {
	private final HouseService houseService;

	@GetMapping()
	public List<Maisons> getAllHouses() {
		return houseService.getAllHouses();
	}

	@PostMapping()
	public Maisons saveHouse(Maisons house) {
		return houseService.saveHouse(house);
	}
	@GetMapping("/{id}")
	public Maisons getHouseById(@PathVariable Long id) {
		return houseService.getHouseById(id);
	}

	@PostMapping("/update")
	public Maisons updateHouse(Maisons house) {
		return houseService.updateHouse(house);
	}
	@PutMapping("{id}")
	public Maisons updateHouse(@PathVariable Long id, @RequestBody Maisons house) {
		house.setId(id);
		return houseService.updateHouse(house);
	}

	@DeleteMapping("{id}")
	public void deleteHouse(@PathVariable Long id) {
		houseService.deleteHouse(id);
	}


}
