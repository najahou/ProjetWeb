package com.SmartHopes.SmartHopes.Entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_demande")
public class Demande {
	@Id
	private int id_demande;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "patient_id")
	private Patient patient_id;

    public Demande() {

    }
	public int getId_demande() {
		return id_demande;
	}

    public Demande(int id_demande, Patient patient_id) {
        this.id_demande = id_demande;
        this.patient_id = patient_id;
    }

    public void setId_demande(int id_demande) {
		this.id_demande = id_demande;
	}
	

}
