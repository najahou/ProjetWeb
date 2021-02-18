package com.SmartHopes.SmartHopes.Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("Responsable")
public class Responsable extends Personne {

    private String autre_tele;
    private boolean actif;

    public Responsable(long id, String nom, String prenom, String cin, Date dat_naissance, String sexe, String telephone, String adresse, String autre_tele, boolean actif) {
        super(id, nom, prenom, cin, dat_naissance, sexe, telephone, adresse);
        this.autre_tele = autre_tele;
        this.actif = actif;
    }

    public Responsable() {

    }

    public String getAutre_tele() {
        return autre_tele;
    }

    public void setAutre_tele(String autre_tele) {
        this.autre_tele = autre_tele;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }
}
