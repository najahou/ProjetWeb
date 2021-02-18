package com.SmartHopes.SmartHopes.Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("Urgent")
public class Urgent extends Demande {


	
	private String Description;


	public Urgent(String id_demande, String Description) {
		super(id_demande);
		this.Description = Description;
	}

	public Urgent() {

	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
	
}
