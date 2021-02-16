package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.Medicament;

public interface MedicamentRepository extends JpaRepository<Medicament, Long> {

}
