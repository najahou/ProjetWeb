package com.SmartHopes.SmartHopes.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_personne")

public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String cin;
    private Date dat_naissance;
    private String sexe;
    private String telephone;
    private String adresse;

    public Personne() {
    }

    public Personne(String nom, String prenom, String cin, Date dat_naissance, String sexe, String telephone,
                    String adresse) {
        super();
        this.id=id;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.dat_naissance = dat_naissance;
        this.sexe = sexe;
        this.telephone = telephone;
        this.adresse = adresse;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Date getDat_naissance() {
        return dat_naissance;
    }
    public void setDat_naissance(Date dat_naissance) {
        this.dat_naissance = dat_naissance;
    }
    public String getSexe() {
        return sexe;
    }
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }




}
