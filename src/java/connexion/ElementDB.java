package connexion;

import java.sql.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ElementDB extends DBconnexion {

    public String[][] selectAll(String table,String where,String join,int nbColumn) {
        String [][] result=  null;int lignes =0;
        String sql = "select * from "+ table;
        if(join!=null || join!="") sql+= " " + join;
        if(where!="") sql+= " where" + where;
        //System.out.println(sql);
        try {
            Connection con = connection(); 
            Statement stmt = con.createStatement();
            Statement stmt1 = con.createStatement();
            ResultSet  res = stmt.executeQuery(sql);
            ResultSet  res1 = stmt1.executeQuery(sql);
            while(res.next()) {
                lignes++;
            }
            result = new String[lignes][nbColumn];
            lignes = 0;
            while(res1.next()) {
                for(int i=0;i<nbColumn;i++) {
                    result[lignes][i] = res1.getString(i+1);
                }lignes++;
            }
            //result= req.split(",");
            con.close();
        } catch (Exception e) {
            result = null;
            System.out.println("erreur de requete");
        }
        return result;
    }

    public String[] select(String column,String table, String where ,String join) {
        String req = "";
        String[] result = null;
        String sql = "select "+ column + " from " + table;
        if(join!=null || join!="") sql+= " " + join;
        if(where!="") sql+= " where" + where;
        System.out.println(sql);
        
        try {
            Connection con =connection(); 
            Statement stmt = con.createStatement();
            ResultSet  res = stmt.executeQuery(sql);
            while(res.next()) {
                req+= res.getString(1)+",";
            }
            result= req.split(",");
            con.close();
        } catch (Exception e) {
            System.out.println("erreur de requete");
        }
       return result;
    }

    public void insert(String table,String[] values) throws SQLException{
        String sql = "insert into " + table + " values (";
        String sep = "'";
        for(int i=0;i<values.length;i++) {
            if(values[i].equals("default")) sep = "";
            else sep="'";
            if(i!=values.length-1) sql+= sep + values[i] + sep + ",";
            else sql+=sep + values[i] + sep;
        }
        sql+=")";
        //System.out.println(sql);
        execute(sql);
    }

    public void delete(String table,String where) throws SQLException {
        String sql= "delete from "+ table + " where ";
        if(where!="") sql+=where;
        //System.out.println(sql);
        execute(sql);
    }

    public void update(String table, String column, String OA , String values , String where) throws SQLException {
        String sql = "update "+ table + " set ";
        sql+= where(column, OA, values);
        if(where !=null || where!="") sql+= " where " +where;
        //System.out.println(sql);
        execute(sql);
    }

    public String where(String column, String OA, String values) throws SQLException {
        String[] cols = column.split(",");
        String[] vals = values.split(",");
        String[] OAs = OA.split(",");
        String sep = "'";
        String where  = " ";
        int j = 0;
        for(int i=0;i<cols.length;i++) {
            if(vals[i].equals("default")) sep ="";
            else sep="'";
            where+= cols[i] + "="+ sep + vals[i]+ sep;
            if(cols.length>1 &&  !OA.equals("") && j<OAs.length) {
                where+= " " + OAs[j] +" ";
                j++;
            } else if(cols.length>1 && OA.equals("") && j<cols.length-1) {
                where+= " ,";
                j++;
            }
        }
        return where;
    }

    public String join(String table1,String table2, String keys1 ,String keys2) {
        String[] T1 = table1.split(",");
        String[] T2 = table2.split(",");
        String[] K1 = keys1.split(",");
        String[] K2 = keys2.split(",");
        String join = "";
        for(int i=0;i<T1.length;i++) {
            join+= " join " + T1[i] + " on " + T2[i] + "."+K2[i]+"="+T1[i]+"."+K1[i]; 
        }
        return join;
    }

    public String values (String[] val) {
        String res = "";
        for(int i=0;i<val.length;i++) {
            if(i!=val.length-1) res+=val[i] + ",";
            else res+=val[i]+"";
        }
        return res;
    }

    public Date DATE(String dateY_M_D) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date myDate = (Date) formatter.parse(dateY_M_D);
        return myDate;
    }

    public String getDATE(String dateY_M_D) throws ParseException {
        Date date = DATE(dateY_M_D);
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        return sqlDate.toString();
    }

    public String dateNow() throws ParseException{
        java.sql.Date sqlDate = new java.sql.Date(new Date().getTime());
        return sqlDate.toString();
    }

    void execute(String sql) {
        try {
            Connection con = connection();
            Statement stmt = con.createStatement();
            stmt.executeQuery(sql);
            con.close();
        } catch (Exception e) {
            //System.out.println("erreur de requete");
        }
    }

}
