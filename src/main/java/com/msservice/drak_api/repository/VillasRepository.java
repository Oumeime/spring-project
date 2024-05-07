package com.msservice.drak_api.repository;

import com.msservice.drak_api.model.Villas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VillasRepository extends JpaRepository<Villas, Long> {
}
