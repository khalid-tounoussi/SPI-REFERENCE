package com.dosi.repositories;

import com.dosi.entities.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatRepository extends JpaRepository<Candidat, String> {
}