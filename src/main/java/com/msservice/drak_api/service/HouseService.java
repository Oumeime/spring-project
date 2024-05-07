package com.msservice.drak_api.service;


import com.msservice.drak_api.model.Maisons;
import com.msservice.drak_api.repository.HousesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HouseService {
	private final HousesRepository houseRepository;

	public List<Maisons> getAllHouses() {
		return houseRepository.findAll();
	}
	public Maisons getHouseById(Long id) {
		return houseRepository.findById(id).orElse(null);
	}
	public Maisons saveHouse(Maisons house) {
		return houseRepository.save(house);
	}
	public void deleteHouse(Long id) {
		houseRepository.deleteById(id);
	}
	public Maisons updateHouse(Maisons house) {
		return houseRepository.save(house);
	}
}
