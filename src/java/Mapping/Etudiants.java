package Mapping;

import java.util.Date;

public class Etudiants {
    private Integer id;
    private String nom;
    private Integer idNiveau;
    private Date date_naissance;
    private String numETU;
    private Date dateInscription;
    private Integer sexe;
    private String adresse;
    private Integer idProm;


    public Etudiants(Integer id, String nom, Integer idNiveau, Date date_naissance, String numETU, Date dateInscription, Integer sexe, String adresse, Integer idProm) {
        this.id = id;
        this.nom = nom;
        this.idNiveau = idNiveau;
        this.date_naissance = date_naissance;
        this.numETU = numETU;
        this.dateInscription = dateInscription;
        this.sexe = sexe;
        this.adresse = adresse;
        this.idProm = idProm;
    }

    public Integer getIdProm() {
        return idProm;
    }

    public void setIdProm(Integer idProm) {
        this.idProm = idProm;
    }
    

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getIdNiveau() {
        return this.idNiveau;
    }

    public void setIdNiveau(Integer idNiveau) {
        this.idNiveau = idNiveau;
    }

    public Date getDate_naissance() {
        return this.date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getNumETU() {
        return this.numETU;
    }

    public void setNumETU(String numETU) {
        this.numETU = numETU;
    }

    public Date getDateInscription() {
        return this.dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public Integer getSexe() {
        return this.sexe;
    }

    public void setSexe(Integer sexe) {
        this.sexe = sexe;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
}
