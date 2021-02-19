package com.SmartHopes.SmartHopes.Entities;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Emp extends Personne{
	
	private String a1;

	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(String nom, String prenom, String cin, Date dat_naissance, String sexe, String telephone,
			String adresse,String a1) {
		super(nom, prenom, cin, dat_naissance, sexe, telephone, adresse);
		// TODO Auto-generated constructor stub
		this.a1=a1;
	}
	
}
