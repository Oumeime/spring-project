package com.msservice.drak_api.repository;

import com.msservice.drak_api.model.Paiyements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiyementsRepository extends JpaRepository<Paiyements, Long> {
}
