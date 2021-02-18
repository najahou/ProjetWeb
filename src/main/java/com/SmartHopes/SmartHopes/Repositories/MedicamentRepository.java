package com.SmartHopes.SmartHopes.Repositories;

import com.SmartHopes.SmartHopes.Entities.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentRepository extends JpaRepository<Medicament, Long> {

}
