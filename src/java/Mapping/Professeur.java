package Mapping;

public class Professeur {
    private Integer id;
    private String nom;
    private String numProf;
    private String mdp;


    public Professeur(Integer id, String nom, String numProf, String mdp) {
        this.id = id;
        this.nom = nom;
        this.numProf = numProf;
        this.mdp = mdp;
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

    public String getNumProf() {
        return this.numProf;
    }

    public void setNumProf(String numProf) {
        this.numProf = numProf;
    }

    public String getMdp() {
        return this.mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

}
