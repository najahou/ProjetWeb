package com.SmartHopes.SmartHopes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SmartHopes.SmartHopes.Entities.Pharmacie;
import com.SmartHopes.SmartHopes.Repositories.PharmacieRepository;
@Service
public class PharmacieService implements PharmacieInterface {
	@Autowired PharmacieRepository pr;
	@Override
	public Pharmacie saveProduit(Pharmacie p) {
		// TODO Auto-generated method stub
		return pr.save(p);
	}

	@Override
	public Pharmacie updatePharmacie(Pharmacie p) {
		// TODO Auto-generated method stub
		return pr.save(p);
	}

	@Override
	public void deletePharmacie(Pharmacie p) {
		
		pr.delete(p);
	}

	@Override
	public void deletePharmacieById(int id) {
		pr.deleteById(id);
		
	}

	@Override
	public Pharmacie getPharmacie(int id) {
		// TODO Auto-generated method stub
		return pr.findById(id).get();
	}

	@Override
	public List<Pharmacie> getAllPharmacies() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

}
