package mapping;

import java.util.Date;

public class Notes {
    private Integer id;
    private Integer idEtudiant;
    private Integer idMatiere;
    private Double note;
    private Date date;
    private Integer numeroExamen;


    public Notes(Integer id, Integer idEtudiant, Integer idMatiere, Double note, Date date, Integer numeroExamen) {
        this.id = id;
        this.idEtudiant = idEtudiant;
        this.idMatiere = idMatiere;
        this.note = note;
        this.date = date;
        this.numeroExamen = numeroExamen;
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

    public Integer getIdMatiere() {
        return this.idMatiere;
    }

    public void setIdMatiere(Integer idMatiere) {
        this.idMatiere = idMatiere;
    }

    public Double getNote() {
        return this.note;
    }

    public void setNote(Double note) {
        this.note = note;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getNumeroExamen() {
        return this.numeroExamen;
    }

    public void setNumeroExamen(Integer numeroExamen) {
        this.numeroExamen = numeroExamen;
    }

}
