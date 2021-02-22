package com.SmartHopes.SmartHopes;

import com.SmartHopes.SmartHopes.Entities.*;
import com.SmartHopes.SmartHopes.Repositories.DemandeRepository;
import com.SmartHopes.SmartHopes.Repositories.PersonneRepository;
import com.SmartHopes.SmartHopes.Repositories.chambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SmartHopesApplication implements CommandLineRunner
	{
		@Autowired
		private PersonneRepository repo;

		@Autowired
		private chambreRepository r;
	
	public static void main(String[] args) {
		SpringApplication.run(SmartHopesApplication.class, args);
		System.out.println("hello");
		
	}
		@Override
		public void run(String... args) throws Exception {


		}
	}
