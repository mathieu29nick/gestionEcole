package Mapping;

public class Secretaire {
    private Integer id;
    private String nom;
    private String numSecretaire;
    private String mdp;


    public Secretaire(Integer id, String nom, String numSecretaire, String mdp) {
        this.id = id;
        this.nom = nom;
        this.numSecretaire = numSecretaire;
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

    public String getNumSecretaire() {
        return this.numSecretaire;
    }

    public void setNumSecretaire(String numSecretaire) {
        this.numSecretaire = numSecretaire;
    }

    public String getMdp() {
        return this.mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

}