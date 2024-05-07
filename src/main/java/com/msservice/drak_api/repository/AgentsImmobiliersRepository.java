package com.msservice.drak_api.repository;
import com.msservice.drak_api.model.AgentsImmobiliers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AgentsImmobiliersRepository extends JpaRepository<AgentsImmobiliers, Long> {
}
