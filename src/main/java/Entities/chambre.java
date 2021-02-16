package Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class chambre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@OneToMany(mappedBy = "chambre")
	private Long id_ch;
	private int num_chambre;
	private String etage;
	private int nb_lit;
	
	
	
	public chambre(int num_chambre, String etage, int nb_lit) {
		super();
		this.num_chambre = num_chambre;
		this.etage = etage;
		this.nb_lit = nb_lit;
	}



	public int getNum_chambre() {
		return num_chambre;
	}



	public void setNum_chambre(int num_chambre) {
		this.num_chambre = num_chambre;
	}



	public int getNb_lit() {
		return nb_lit;
	}



	public void setNb_lit(int nb_lit) {
		this.nb_lit = nb_lit;
	}



	public String getEtage() {
		return etage;
	}



	public void setEtage(String etage) {
		this.etage = etage;
	}
	
	
	

}
