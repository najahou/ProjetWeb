package com.SmartHopes.SmartHopes.Repositories;

import com.SmartHopes.SmartHopes.Entities.Rappel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RappelRepository extends JpaRepository<Rappel, Long> {

}
