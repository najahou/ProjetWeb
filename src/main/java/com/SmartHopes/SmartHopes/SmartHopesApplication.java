package com.SmartHopes.SmartHopes;

import com.SmartHopes.SmartHopes.Entities.*;
import com.SmartHopes.SmartHopes.Repositories.*;
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
		private MedicamentRepository m;

		@Autowired
		private PharmacieRepository p;


		public static void main(String[] args) {
		SpringApplication.run(SmartHopesApplication.class, args);
		System.out.println("hello");
		
	}
		@Override
		public void run(String... args) throws Exception {
                //Pharmacie p1=new Pharmacie(1,"hh","gg","pp","pp");
                //p.save(p1);
                //m.save((new Medicament("jjj","bjbj","hghg","hgh",p1)));
		}
	}
