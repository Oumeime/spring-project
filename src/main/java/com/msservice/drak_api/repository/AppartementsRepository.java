package com.msservice.drak_api.repository;

import com.msservice.drak_api.model.Appartements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppartementsRepository extends JpaRepository<Appartements, Long> {
}
