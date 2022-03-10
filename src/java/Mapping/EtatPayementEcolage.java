package Mapping;

public class EtatPayementEcolage {
    private Integer id;
    private String niveau;
    private Double paye;
    private Double reste;
    private Double ecolage;

    public EtatPayementEcolage(Integer id, String niveau, Double paye, Double reste, Double ecolage) {
        this.id = id;
        this.niveau = niveau;
        this.paye = paye;
        this.reste = reste;
        this.ecolage = ecolage;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNiveau() {
        return this.niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public Double getPaye() {
        return this.paye;
    }

    public void setPaye(Double paye) {
        this.paye = paye;
    }

    public Double getReste() {
        return this.reste;
    }

    public void setReste(Double reste) {
        this.reste = reste;
    }

    public Double getEcolage() {
        return this.ecolage;
    }

    public void setEcolage(Double ecolage) {
        this.ecolage = ecolage;
    }


}
