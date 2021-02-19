package com.SmartHopes.SmartHopes.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class testinsertion {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long inserting;

	
	public Long getInserting() {
		return inserting;
	}

	

	public void setInserting() {
		this.inserting = inserting;
	}

	public testinsertion() {
		
		
	}
	
}
