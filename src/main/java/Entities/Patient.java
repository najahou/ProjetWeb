package Entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
@DiscriminatorValue("Patient")

public class Patient extends Personne {
	@OneToMany(mappedBy = "Rappel")
	private String Num_dossier;
	private String ville;
	private String id_securite;
	private String Photo;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="chambre_id",  referencedColumnName="id_ch")
	private chambre chambre_id;
	

	public Patient(Long id, String nom, String prenom, String cin, Date dat_naissance, String sexe, String telephone,
			String adresse, String num_dossier, String ville, String id_securite, String photo) {
		super(id, nom, prenom, cin, dat_naissance, sexe, telephone, adresse);
		Num_dossier = num_dossier;
		this.ville = ville;
		this.id_securite = id_securite;
		Photo = photo;
	}



	public String getPhoto() {
		return Photo;
	}



	public void setPhoto(String photo) {
		Photo = photo;
	}



	public String getNum_dossier() {
		return Num_dossier;
	}


	public void setNum_dossier(String num_dossier) {
		Num_dossier = num_dossier;
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
	

	
	
	
}
