package com.SmartHopes.SmartHopes.Entities;

import javax.persistence.*;

@Entity
public class Rappel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int nb_fois;
	private String heur;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "patient_id")
	private Patient patient_id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "medicament_id")
	private Medicament medicament_id;

	public Rappel() {
	}

	public Rappel(Long id, int nb_fois, String heur, Patient patient_id, Medicament medicament_id) {
		this.id = id;
		this.nb_fois = nb_fois;
		this.heur = heur;
		this.patient_id = patient_id;
		this.medicament_id = medicament_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNb_fois() {
		return nb_fois;
	}

	public void setNb_fois(int nb_fois) {
		this.nb_fois = nb_fois;
	}

	public String getHeur() {
		return heur;
	}

	public void setHeur(String heur) {
		this.heur = heur;
	}

	public Patient getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(Patient patient_id) {
		this.patient_id = patient_id;
	}

	public Medicament getMedicament_id() {
		return medicament_id;
	}

	public void setMedicament_id(Medicament medicament_id) {
		this.medicament_id = medicament_id;
	}
}
