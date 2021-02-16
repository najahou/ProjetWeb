package Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Besoin")
public class Besoin extends Demande {
	
	
	private String id_besoin;
	private String capture;
	private String msg_vocale;
	public String getId_besoin() {
		return id_besoin;
	}
	
	
	public Besoin(String id_demande, String id_besoin, String capture, String msg_vocale) {
		super(id_demande);
		this.id_besoin = id_besoin;
		this.capture = capture;
		this.msg_vocale = msg_vocale;
	}


	public void setId_besoin(String id_besoin) {
		this.id_besoin = id_besoin;
	}
	public String getMsg_vocale() {
		return msg_vocale;
	}
	public void setMsg_vocale(String msg_vocale) {
		this.msg_vocale = msg_vocale;
	}


	public String getCapture() {
		return capture;
	}


	public void setCapture(String capture) {
		this.capture = capture;
	}
	
	
	
	
	

}
