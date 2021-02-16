package Entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Responsable")
public class Responsable extends Personne {

	private String code_responsable;
	private String autre_telephone;
	
	
	public Responsable(Long id, String nom, String prenom, String cin, Date dat_naissance, String sexe,
			String telephone, String adresse, String code_responsable, String autre_telephone) {
		super(id, nom, prenom, cin, dat_naissance, sexe, telephone, adresse);
		this.code_responsable = code_responsable;
		this.autre_telephone = autre_telephone;
	}
	
	
	public String getCode_responsable() {
		return code_responsable;
	}
	public void setCode_responsable(String code_responsable) {
		this.code_responsable = code_responsable;
	}
	public String getAutre_telephone() {
		return autre_telephone;
	}
	public void setAutre_telephone(String autre_telephone) {
		this.autre_telephone = autre_telephone;
	}

}
