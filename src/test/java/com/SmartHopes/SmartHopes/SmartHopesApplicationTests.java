package com.SmartHopes.SmartHopes;

import java.util.Date;

import com.SmartHopes.SmartHopes.Entities.Responsable;
import com.SmartHopes.SmartHopes.Repositories.PersonneRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SmartHopesApplicationTests {


    @Autowired
    private PersonneRepository repo;

    @Test
    public void insert(){

        repo.save(new Responsable("najah", "oua", "a445", new Date(), "fille", "0565656565", "reu dkj", "065555555", false));

    }

}
