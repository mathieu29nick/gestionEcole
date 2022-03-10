package Mapping;

import java.util.Date;

public class NoteNonValide {
    private Integer idNiv;
    private String nomNiv;
    private Integer idProm;
    private String prom;
    private Integer id;
    private String nom;
    private String numEtu;
    private Integer idMat;
    private String nomMat;
    private Integer coeff;
    private Integer idNote;
    private Date date;


    public NoteNonValide(Integer idNiv, String nomNiv, Integer idProm, String prom, Integer id, String nom, String numEtu, Integer idMat, String nomMat, Integer coeff, Integer idNote, Date date) {
        this.idNiv = idNiv;
        this.nomNiv = nomNiv;
        this.idProm = idProm;
        this.prom = prom;
        this.id = id;
        this.nom = nom;
        this.numEtu = numEtu;
        this.idMat = idMat;
        this.nomMat = nomMat;
        this.coeff = coeff;
        this.idNote = idNote;
        this.date = date;
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

    public String getNumEtu() {
        return this.numEtu;
    }

    public void setNumEtu(String numEtu) {
        this.numEtu = numEtu;
    }

    public Integer getIdMat() {
        return this.idMat;
    }

    public void setIdMat(Integer idMat) {
        this.idMat = idMat;
    }

    public String getNomMat() {
        return this.nomMat;
    }

    public void setNomMat(String nomMat) {
        this.nomMat = nomMat;
    }

    public Integer getCoeff() {
        return this.coeff;
    }

    public void setCoeff(Integer coeff) {
        this.coeff = coeff;
    }

    public Integer getIdNote() {
        return this.idNote;
    }

    public void setIdNote(Integer idNote) {
        this.idNote = idNote;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
