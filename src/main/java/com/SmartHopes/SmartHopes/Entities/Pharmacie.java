package com.SmartHopes.SmartHopes.Entities;


import javax.persistence.*;
import java.util.List;


@Entity
public class Pharmacie {

	@Id
	private int code_pharmacie;
	private String nompharmacie;
	private String location;
	private String telephone;
	private String email;

	@OneToMany(mappedBy = "pharmacie", cascade = CascadeType.ALL)
	private List< Medicament > medicamentList;

	public Pharmacie() {
	}

	public Pharmacie(int code_pharmacie, String nompharmacie, String location, String telephone, String email) {
		this.code_pharmacie = code_pharmacie;
		this.nompharmacie = nompharmacie;
		this.location = location;
		this.telephone = telephone;
		this.email = email;
	}

	public int getCode_pharmacie() {
		return code_pharmacie;
	}

	public void setCode_pharmacie(int code_pharmacie) {
		this.code_pharmacie = code_pharmacie;
	}

	public String getNompharmacie() {
		return nompharmacie;
	}

	public void setNompharmacie(String nompharmacie) {
		this.nompharmacie = nompharmacie;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Medicament> getMedicamentList() {
		return medicamentList;
	}

	public void setMedicamentList(List<Medicament> medicamentList) {
		this.medicamentList = medicamentList;
	}
}
