package mapping;

import java.util.Date;

public class DetailEtudiant {
    private Integer idNiv;
    private String NomNiv;
    private Double ecolage;
    private Integer idProm;
    private String prom;
    private Integer id;
    private String nom;
    private Date date_naissance;
    private String numEtu;
    private Date dateInscription;
    private Integer sexe;
    private String adresse;


    public DetailEtudiant(Integer idNiv, String NomNiv, Double ecolage, Integer idProm, String prom, Integer id, String nom, Date date_naissance, String numEtu, Date dateInscription, Integer sexe, String adresse) {
        this.idNiv = idNiv;
        this.NomNiv = NomNiv;
        this.ecolage = ecolage;
        this.idProm = idProm;
        this.prom = prom;
        this.id = id;
        this.nom = nom;
        this.date_naissance = date_naissance;
        this.numEtu = numEtu;
        this.dateInscription = dateInscription;
        this.sexe = sexe;
        this.adresse = adresse;
    }

    public Integer getIdNiv() {
        return this.idNiv;
    }

    public void setIdNiv(Integer idNiv) {
        this.idNiv = idNiv;
    }

    public String getNomNiv() {
        return this.NomNiv;
    }

    public void setNomNiv(String NomNiv) {
        this.NomNiv = NomNiv;
    }

    public Double getEcolage() {
        return this.ecolage;
    }

    public void setEcolage(Double ecolage) {
        this.ecolage = ecolage;
    }

    public Integer getIdProm() {
        return this.idProm;
    }

    public void setIdProm(Integer idProm) {
        this.idProm = idProm;
    }

    public String getProm() {
        return this.prom;
    }

    public void setProm(String prom) {
        this.prom = prom;
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

    public Date getDate_naissance() {
        return this.date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getNumEtu() {
        return this.numEtu;
    }

    public void setNumEtu(String numEtu) {
        this.numEtu = numEtu;
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
