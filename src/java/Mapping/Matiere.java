package mapping;
public class Matiere {
    private Integer id;
    private String nom;
    private Integer coeff;
    private Integer idNiveau;
    private Integer idProf;
    private Integer nombreExamen;

    public Matiere(Integer id, String nom, Integer coeff, Integer idNiveau, Integer idProf, Integer nombreExamen) {
        this.id = id;
        this.nom = nom;
        this.coeff = coeff;
        this.idNiveau = idNiveau;
        this.idProf = idProf;
        this.nombreExamen = nombreExamen;
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

    public Integer getCoeff() {
        return this.coeff;
    }

    public void setCoeff(Integer coeff) {
        this.coeff = coeff;
    }

    public Integer getIdNiveau() {
        return this.idNiveau;
    }

    public void setIdNiveau(Integer idNiveau) {
        this.idNiveau = idNiveau;
    }

    public Integer getIdProf() {
        return this.idProf;
    }

    public void setIdProf(Integer idProf) {
        this.idProf = idProf;
    }

    public Integer getNombreExamen() {
        return this.nombreExamen;
    }

    public void setNombreExamen(Integer nombreExamen) {
        this.nombreExamen = nombreExamen;
    }

}
