package com.SmartHopes.SmartHopes.Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("Urgent")
public class Urgent extends Demande {


	
	private String Description;


	public Urgent() {

	}

	public Urgent(int id_demande, Patient patient_id, String description) {
		super(id_demande, patient_id);
		Description = description;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
	
}
