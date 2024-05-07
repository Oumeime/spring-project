package com.msservice.drak_api.repository;

import com.msservice.drak_api.model.Administrateurs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrateursRepository extends JpaRepository<Administrateurs, Long> {
}
