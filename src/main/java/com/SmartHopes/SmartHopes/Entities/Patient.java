package com.SmartHopes.SmartHopes.Entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@DiscriminatorValue("Patient")
public class Patient extends Personne {
	
	private String num_dossier;
	private String ville;
	private String id_securite;
	private String photo;

	@OneToMany(mappedBy = "patient_id", cascade = CascadeType.ALL)
	private List < Demande > demandeList;

	@OneToMany(mappedBy = "patient_id", cascade = CascadeType.ALL)
	private List < Rappel > rappelList;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "chambre_id")
	private chambre chambre_id;

	public Patient(long id, String nom, String prenom, String cin, Date dat_naissance, String sexe, String telephone, String adresse, String num_dossier, String ville, String id_securite, String photo, List<Demande> demandeList, List<Rappel> rappelList, chambre chambre_id) {
		super(id, nom, prenom, cin, dat_naissance, sexe, telephone, adresse);
		this.num_dossier = num_dossier;
		this.ville = ville;
		this.id_securite = id_securite;
		this.photo = photo;
		this.demandeList = demandeList;
		this.rappelList = rappelList;
		this.chambre_id = chambre_id;
	}

	public Patient() {

	}

	public String getNum_dossier() {
		return num_dossier;
	}

	public void setNum_dossier(String num_dossier) {
		this.num_dossier = num_dossier;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getId_securite() {
		return id_securite;
	}

	public void setId_securite(String id_securite) {
		this.id_securite = id_securite;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public List<Rappel> getRappelList() {
		return rappelList;
	}

	public void setRappelList(List<Rappel> rappelList) {
		this.rappelList = rappelList;
	}

	public chambre getChambre_id() {
		return chambre_id;
	}

	public void setChambre_id(chambre chambre_id) {
		this.chambre_id = chambre_id;
	}
}
