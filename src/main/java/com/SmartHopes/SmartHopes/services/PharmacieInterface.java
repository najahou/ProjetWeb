package com.SmartHopes.SmartHopes.services;

import java.util.List;

import com.SmartHopes.SmartHopes.Entities.Pharmacie;



public interface PharmacieInterface {
	 public Pharmacie saveProduit(Pharmacie p );
	 Pharmacie updatePharmacie(Pharmacie p);
	 void deletePharmacie(Pharmacie p);
	 void deletePharmacieById(int id);
	 Pharmacie getPharmacie(int id);
	 List<Pharmacie> getAllPharmacies();
}
