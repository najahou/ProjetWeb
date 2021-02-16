package Entities;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_demande")

public class Demande {
	
	private String id_demande;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="patient_id",  referencedColumnName="Num_dossier")
	private Patient patient_id;

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
