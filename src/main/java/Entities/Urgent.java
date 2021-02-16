package Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Urgent")
public class Urgent extends Demande {
	
	
	
	private String id_urgent;
	

	public Urgent(String id_demande, String id_urgent) {
		super(id_demande);
		this.id_urgent = id_urgent;
	}

	public String getId_urgent() {
		return id_urgent;
	}

	public void setId_urgent(String id_urgent) {
		this.id_urgent = id_urgent;
	}
	
	

}
