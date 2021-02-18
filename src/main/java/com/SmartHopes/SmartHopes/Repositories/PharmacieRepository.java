package com.SmartHopes.SmartHopes.Repositories;

import com.SmartHopes.SmartHopes.Entities.Pharmacie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacieRepository extends JpaRepository<Pharmacie, Integer>{

}
