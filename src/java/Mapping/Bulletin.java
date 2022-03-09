package mapping;

public class Bulletin {
    private Integer id;
    private String numEtu;
    private String matiere;
    private Integer coeff;
    private Double notes;
    private String merite;


    public Bulletin(Integer id, String numEtu, String matiere, Integer coeff, Double notes, String merite) {
        this.id = id;
        this.numEtu = numEtu;
        this.matiere = matiere;
        this.coeff = coeff;
        this.notes = notes;
        this.merite = merite;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumEtu() {
        return this.numEtu;
    }

    public void setNumEtu(String numEtu) {
        this.numEtu = numEtu;
    }

    public String getMatiere() {
        return this.matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public Integer getCoeff() {
        return this.coeff;
    }

    public void setCoeff(Integer coeff) {
        this.coeff = coeff;
    }

    public Double getNotes() {
        return this.notes;
    }

    public void setNotes(Double notes) {
        this.notes = notes;
    }

    public String getMerite() {
        return this.merite;
    }

    public void setMerite(String merite) {
        this.merite = merite;
    }

}
