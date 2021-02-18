package com.SmartHopes.SmartHopes.Repositories;

import com.SmartHopes.SmartHopes.Entities.chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface chambreRepository extends JpaRepository<chambre, String> {

}
