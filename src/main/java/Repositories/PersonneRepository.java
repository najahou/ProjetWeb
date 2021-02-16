package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne , Long> {

}
