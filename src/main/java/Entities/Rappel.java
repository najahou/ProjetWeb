package Entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Rappel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int nb_fois;
	private String heur;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="patient_id",  referencedColumnName="Num_dossier")
	private Patient patient_id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="medicament_id",  referencedColumnName="id_medic")
	private Medicament medicament_id;
	
	public Rappel(int nb_fois, String heur) {
		super();
		this.nb_fois = nb_fois;
		this.heur = heur;
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
	
	
	

}
