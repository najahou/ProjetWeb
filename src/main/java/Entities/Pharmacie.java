package Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Pharmacie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@OneToMany(mappedBy = "Medicament")
	private String code_pharmacie;
	private String nompharmacie;
	private String location;
	private String telephone;
	private String email;
	
	
	
	public Pharmacie(String code_pharmacie, String nompharmacie, String location, String telephone, String email) {
		super();
		this.code_pharmacie = code_pharmacie;
		this.nompharmacie = nompharmacie;
		this.location = location;
		this.telephone = telephone;
		this.email = email;
	}
	
	public String getCode_pharmacie() {
		return code_pharmacie;
	}
	public void setCode_pharmacie(String code_pharmacie) {
		this.code_pharmacie = code_pharmacie;
	}
	public String getNompharmacie() {
		return nompharmacie;
	}
	public void setNompharmacie(String nompharmacie) {
		this.nompharmacie = nompharmacie;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
