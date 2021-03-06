package com.SmartHopes.SmartHopes.Entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Besoin")
public class Besoin extends Demande {


	private String capture;
	private String msg_vocale;

	public Besoin() {
	}

	public Besoin(int id_demande, Patient patient_id, String capture, String msg_vocale) {
		super(id_demande, patient_id);
		this.capture = capture;
		this.msg_vocale = msg_vocale;
	}

	public String getCapture() {
		return capture;
	}

	public void setCapture(String capture) {
		this.capture = capture;
	}

	public String getMsg_vocale() {
		return msg_vocale;
	}

	public void setMsg_vocale(String msg_vocale) {
		this.msg_vocale = msg_vocale;
	}
}
