package Entities;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Medicament {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@OneToMany(mappedBy = "Rappel")
	private Long id_medic;
	private String reference;
	private String nom_medicament;
	private String effects;
	private String contreIndication;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pharmacie",  referencedColumnName="code_pharmacie")

	private Pharmacie pharmacie;
	
	public Medicament(String reference, String nom_medicament, String effects, String contreIndication) {
		super();
		this.reference = reference;
		this.nom_medicament = nom_medicament;
		this.effects = effects;
		this.contreIndication = contreIndication;
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
	

}
