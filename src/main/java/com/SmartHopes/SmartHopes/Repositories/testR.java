package com.SmartHopes.SmartHopes.Repositories;

import com.SmartHopes.SmartHopes.Entities.test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface testR  extends JpaRepository<test,Integer> {
}
