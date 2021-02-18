package com.SmartHopes.SmartHopes.Repositories;


import com.SmartHopes.SmartHopes.Entities.Demande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandeRepository extends JpaRepository<Demande, String>{

}
