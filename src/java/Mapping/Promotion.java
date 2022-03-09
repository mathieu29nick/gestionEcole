package mapping;

public class Promotion {
    private Integer id;
    private String nom;
    private Integer actuel;


    public Promotion(Integer id, String nom, Integer actuel) {
        this.id = id;
        this.nom = nom;
        this.actuel = actuel;
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

    public Integer getActuel() {
        return this.actuel;
    }

    public void setActuel(Integer actuel) {
        this.actuel = actuel;
    }

}
