package mapping;

public class Admin {
    private Integer id;
    private String nom;
    private String numAdmin;
    private String mdp;


    public Admin(Integer id, String nom, String numAdmin, String mdp) {
        this.id = id;
        this.nom = nom;
        this.numAdmin = numAdmin;
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

    public String getNumAdmin() {
        return this.numAdmin;
    }

    public void setNumAdmin(String numAdmin) {
        this.numAdmin = numAdmin;
    }

    public String getMdp() {
        return this.mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

}
