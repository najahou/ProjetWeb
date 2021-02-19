package com.SmartHopes.SmartHopes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.SmartHopes.SmartHopes.Entities.Demande;
import com.SmartHopes.SmartHopes.Entities.Emp;
import com.SmartHopes.SmartHopes.Entities.Patient;
import com.SmartHopes.SmartHopes.Entities.Personne;
import com.SmartHopes.SmartHopes.Entities.Rappel;
import com.SmartHopes.SmartHopes.Entities.Responsable;
import com.SmartHopes.SmartHopes.Entities.chambre;
import com.SmartHopes.SmartHopes.Entities.testinsertion;
import com.SmartHopes.SmartHopes.Repositories.PersonneRepository;
import com.SmartHopes.SmartHopes.Repositories.chambreRepository;
import com.SmartHopes.SmartHopes.Repositories.reposinsert;

import antlr.collections.List;


@SpringBootTest
class SmartHopesApplicationTests {


	@Autowired PersonneRepository rp;
	@Autowired chambreRepository rpc;
	
	
	@Test
	public void insertion() throws ParseException
	{
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		Date daten = dateformat.parse(String.valueOf("2020-02-02"));
		ArrayList<Demande> dem =  new ArrayList<Demande>();
		ArrayList<Rappel> rep = new ArrayList<Rappel>();
		chambre ch = new chambre(0,"string",1);
		rpc.save(ch);
		Personne p = new Patient("machnaoui","hamza","CIN2525",daten,"male","060505404","adresse","test","hh","hh","hh",dem,rep,ch);
		rp.save(p);
	}
	

}
