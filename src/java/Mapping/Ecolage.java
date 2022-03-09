package mapping;

import java.util.Date;

public class Ecolage {
    private Integer id;
    private Integer idEtudiant;
    private Double montant;
    private Integer mois;
    private Integer annee;
    private Date date;
    private Integer idNiveau;

    public Ecolage(Integer id, Integer idEtudiant, Double montant, Integer mois, Integer annee, Date date, Integer idNiveau) {
        this.id = id;
        this.idEtudiant = idEtudiant;
        this.montant = montant;
        this.mois = mois;
        this.annee = annee;
        this.date = date;
        this.idNiveau = idNiveau;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdEtudiant() {
        return this.idEtudiant;
    }

    public void setIdEtudiant(Integer idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public Double getMontant() {
        return this.montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Integer getMois() {
        return this.mois;
    }

    public void setMois(Integer mois) {
        this.mois = mois;
    }

    public Integer getAnnee() {
        return this.annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getIdNiveau() {
        return this.idNiveau;
    }

    public void setIdNiveau(Integer idNiveau) {
        this.idNiveau = idNiveau;
    }

}
