package com.SmartHopes.SmartHopes.Repositories;


import com.SmartHopes.SmartHopes.Entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
