package Mapping;

public class Niveau {
    private Integer id;
    private String nom;
    private Double ecolage;

    public Niveau(Integer id, String nom, Double ecolage) {
        this.id = id;
        this.nom = nom;
        this.ecolage = ecolage;
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

    public Double getEcolage() {
        return this.ecolage;
    }

    public void setEcolage(Double ecolage) {
        this.ecolage = ecolage;
    }

}
