package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.Demande;

public interface DemandeRepository extends JpaRepository<Demande, String>{

}
