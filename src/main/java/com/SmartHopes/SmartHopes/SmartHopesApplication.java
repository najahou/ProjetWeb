package com.SmartHopes.SmartHopes;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.SmartHopes.SmartHopes.Entities.Besoin;
import com.SmartHopes.SmartHopes.Entities.Emp;
import com.SmartHopes.SmartHopes.Entities.Personne;
import com.SmartHopes.SmartHopes.Entities.testinsertion;
import com.SmartHopes.SmartHopes.Repositories.PersonneRepository;
import com.SmartHopes.SmartHopes.Repositories.reposinsert;

@SpringBootApplication
public class SmartHopesApplication implements CommandLineRunner
	{ 
	    @Autowired
	    private reposinsert  rp;
	public static void main(String[] args) {
		SpringApplication.run(SmartHopesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		
	}
}
