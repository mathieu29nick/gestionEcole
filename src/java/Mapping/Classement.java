package Mapping;

public class Classement {
    private Integer id;
    private String nom;
    private String numEtu;
    private Double moyenne;
    private String merite;
    private String prom;
    private String niveau;


    public Classement(Integer id, String nom, String numEtu, Double moyenne, String merite, String prom, String niveau) {
        this.id = id;
        this.nom = nom;
        this.numEtu = numEtu;
        this.moyenne = moyenne;
        this.merite = merite;
        this.prom = prom;
        this.niveau = niveau;
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

    public Double getMoyenne() {
        return this.moyenne;
    }

    public void setMoyenne(Double moyenne) {
        this.moyenne = moyenne;
    }

    public String getMerite() {
        return this.merite;
    }

    public void setMerite(String merite) {
        this.merite = merite;
    }

    public String getProm() {
        return this.prom;
    }

    public void setProm(String prom) {
        this.prom = prom;
    }

    public String getNiveau() {
        return this.niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

}
