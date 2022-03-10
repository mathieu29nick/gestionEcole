package function;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.*;

import connexion.ElementDB;
import Mapping.*;

public class FunctionMahefa extends ElementDB {
    Integer I(String nb) {return Integer.parseInt(nb);}
    Double D(String nb) {return Double.parseDouble(nb);}
    String S(Object nb) {return String.valueOf(nb);}

    public int login(String nom,String mdp,String statut) throws SQLException {
        String [] val = {nom,mdp};
        String where = where("nom,mdp", "and", values(val));
        String select = select("nom", statut, where, "")[0];
        if(select!="") return 1;
        else return 0;
    }

    public String getPageAcceuil(String nom,String mdp,String statut) throws SQLException {
        int log = login(nom, mdp, statut);
        if(log==1) return "page"+statut;
        else return "index";
    }

    public Vector<Matiere> getListeMatiere() {
        Vector<Matiere> res = new Vector<Matiere>();
        String[][] all = selectAll("matiere", "", "", 6);
        for(int i=0;i<all.length;i++)
             res.add(new Matiere(I(all[i][0]), all[i][1], I(all[i][2]), I(all[i][3]), I(all[i][4]), I(all[i][5])));
        return res;
    }

    public Vector<Promotion> getListePromotion() {
        Vector<Promotion> res = new Vector<Promotion>();
        String[][] all = selectAll("promotion", "", "", 3);
        for(int i=0;i<all.length;i++)
             res.add(new Promotion(I(all[i][0]) ,all[i][1] , I(all[i][2])));
        return res;
    }

    public Vector<Niveau> getListeNiveau() {
        Vector<Niveau> res = new Vector<Niveau>();
        String[][] all = selectAll("niveau", "", "", 3);
        for(int i=0;i<all.length;i++)
             res.add(new Niveau(I(all[i][0]) ,all[i][1] ,D(all[i][2])));
        return res;
    }

    public int getIdEtudiant(String num) throws SQLException {
        String where = where("numetu", "", num);
        return I(select("id", "etudiants", where, "")[0]);
    }

    public int getIdMatiere(String matiere) throws SQLException{
        String where = where("nom", "", matiere);
        return I(select("id", "matiere", where, "")[0]);
    }

    public int getIdProm(String prom) throws SQLException{
        String where = where("nom", "", prom);
        return I(select("id", "promotion", where, "")[0]);
    }

    public int getIdNiveau(String niveau) throws SQLException{
        String where = where("nom", "", niveau);
        return I(select("id", "niveau", where, "")[0]);
    }

    public void insertionNotes(String numEtu, String matiere, String note, String numExam) throws ParseException, SQLException {
        try {
        String idEtu = S(getIdEtudiant(numEtu));
        System.out.println(idEtu);
        String idMat = S(getIdMatiere(matiere));
        String[] values = {"default",idEtu, idMat,note, dateNow(),numExam};
        if(idEtu!="" &&  idEtu!=null && idMat!="" && idMat!=null)
            insert("notes", values);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Vector<DetailEtudiant> getListeEtudiant1() throws ParseException{
        Vector<DetailEtudiant> res = new Vector<DetailEtudiant>();
        String[][] all = selectAll("detailetudiant", "", "", 12);
        for(int i=0;i<all.length;i++)
             res.add(new DetailEtudiant(I(all[i][0]), all[i][1], D(all[i][2]), I(all[i][3]), all[i][4], I(all[i][5]), all[i][6],DATE(all[i][7]), all[i][8], DATE(all[i][9]), I(all[i][10]), all[i][11]));
        return res;
}

}
