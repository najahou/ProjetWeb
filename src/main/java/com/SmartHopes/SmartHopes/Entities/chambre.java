package com.SmartHopes.SmartHopes.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class chambre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_ch;
	private int num_chambre;
	private String etage;
	private int nb_lit;

	@OneToMany(mappedBy = "chambre_id", cascade = CascadeType.ALL)
	private List< Patient > patientList;

	public chambre() {
	}

	public chambre(Long id_ch, int num_chambre, String etage, int nb_lit, List<Patient> patientList) {
		this.id_ch = id_ch;
		this.num_chambre = num_chambre;
		this.etage = etage;
		this.nb_lit = nb_lit;
		this.patientList = patientList;
	}

	public Long getId_ch() {
		return id_ch;
	}

	public void setId_ch(Long id_ch) {
		this.id_ch = id_ch;
	}

	public int getNum_chambre() {
		return num_chambre;
	}

	public void setNum_chambre(int num_chambre) {
		this.num_chambre = num_chambre;
	}

	public String getEtage() {
		return etage;
	}

	public void setEtage(String etage) {
		this.etage = etage;
	}

	public int getNb_lit() {
		return nb_lit;
	}

	public void setNb_lit(int nb_lit) {
		this.nb_lit = nb_lit;
	}

	public List<Patient> getPatientList() {
		return patientList;
	}

	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
	}
}
