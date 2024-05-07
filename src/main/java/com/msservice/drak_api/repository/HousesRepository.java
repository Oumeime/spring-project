package com.msservice.drak_api.repository;

import com.msservice.drak_api.model.Maisons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HousesRepository extends JpaRepository<Maisons, Long> {
}
