package Mapping;

import java.util.Date;

public class EcolageEtudiant {
    private Integer idNiv;
    private String nomNiv;
    private Double ecolageNiv;
    private Integer idProm;
    private String prom;
    private String promActuel;
    private Integer id;
    private String Nom;
    private Date date_naissance;
    private String numEtu;
    private Date dateInscription;
    private Integer sexe;
    private String adresse;
    private Double sommeDate;


    public EcolageEtudiant(Integer idNiv, String nomNiv, Double ecolageNiv, Integer idProm, String prom, String promActuel, Integer id, String Nom, Date date_naissance, String numEtu, Date dateInscription, Integer sexe, String adresse, Double sommeDate) {
        this.idNiv = idNiv;
        this.nomNiv = nomNiv;
        this.ecolageNiv = ecolageNiv;
        this.idProm = idProm;
        this.prom = prom;
        this.promActuel = promActuel;
        this.id = id;
        this.Nom = Nom;
        this.date_naissance = date_naissance;
        this.numEtu = numEtu;
        this.dateInscription = dateInscription;
        this.sexe = sexe;
        this.adresse = adresse;
        this.sommeDate = sommeDate;
    }

    public Integer getIdNiv() {
        return this.idNiv;
    }

    public void setIdNiv(Integer idNiv) {
        this.idNiv = idNiv;
    }

    public String getNomNiv() {
        return this.nomNiv;
    }

    public void setNomNiv(String nomNiv) {
        this.nomNiv = nomNiv;
    }

    public Double getEcolageNiv() {
        return this.ecolageNiv;
    }

    public void setEcolageNiv(Double ecolageNiv) {
        this.ecolageNiv = ecolageNiv;
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

    public String getPromActuel() {
        return this.promActuel;
    }

    public void setPromActuel(String promActuel) {
        this.promActuel = promActuel;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return this.Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
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

    public Double getSommeDate() {
        return this.sommeDate;
    }

    public void setSommeDate(Double sommeDate) {
        this.sommeDate = sommeDate;
    }

}
