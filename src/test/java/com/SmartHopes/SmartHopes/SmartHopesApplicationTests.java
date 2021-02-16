package com.SmartHopes.SmartHopes;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import Entities.Produit;
import Repositories.ProduitRepository;

@SpringBootTest
class SmartHopesApplicationTests {

	@Autowired 
	private ProduitRepository produitRepository; 

	@Test 

	public void testCreateProduit() { 

	Produit prod = new Produit("p1",452.250); 

	produitRepository.save(prod); 

	} 

}
