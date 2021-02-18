package com.SmartHopes.SmartHopes.Entities;


import javax.persistence.*;
import java.util.List;


@Entity
public class Medicament {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_medic;
	private String reference;
	private String nom_medicament;
	private String effects;
	private String contreIndication;

	@OneToMany(mappedBy = "medicament_id", cascade = CascadeType.ALL)
	private List< Rappel > rappelList;


	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "pharmacie")
	private Pharmacie pharmacie;


	public Medicament(Long id_medic, String reference, String nom_medicament, String effects, String contreIndication, List<Rappel> rappelList, Pharmacie pharmacie) {
		this.id_medic = id_medic;
		this.reference = reference;
		this.nom_medicament = nom_medicament;
		this.effects = effects;
		this.contreIndication = contreIndication;
		this.rappelList = rappelList;
		this.pharmacie = pharmacie;
	}

	public Medicament() {

	}

	public Long getId_medic() {
		return id_medic;
	}

	public void setId_medic(Long id_medic) {
		this.id_medic = id_medic;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getNom_medicament() {
		return nom_medicament;
	}

	public void setNom_medicament(String nom_medicament) {
		this.nom_medicament = nom_medicament;
	}

	public String getEffects() {
		return effects;
	}

	public void setEffects(String effects) {
		this.effects = effects;
	}

	public String getContreIndication() {
		return contreIndication;
	}

	public void setContreIndication(String contreIndication) {
		this.contreIndication = contreIndication;
	}

	public List<Rappel> getRappelList() {
		return rappelList;
	}

	public void setRappelList(List<Rappel> rappelList) {
		this.rappelList = rappelList;
	}

	public Pharmacie getPharmacie() {
		return pharmacie;
	}

	public void setPharmacie(Pharmacie pharmacie) {
		this.pharmacie = pharmacie;
	}
}
