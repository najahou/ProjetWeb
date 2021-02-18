package com.SmartHopes.SmartHopes.Entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_demande")
public class Demande {
	@Id
	private String id_demande;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="patient_id")
	private Patient patient_id;

    public Demande() {

    }

	public String getId_demande() {
		return id_demande;
	}

	
	
	public Demande(String id_demande) {
		super();
		this.id_demande = id_demande;
	}


	public void setId_demande(String id_demande) {
		this.id_demande = id_demande;
	}
	

}
