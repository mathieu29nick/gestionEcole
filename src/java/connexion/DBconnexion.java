package connexion;

import java.sql.*;

public class DBconnexion {
    public Connection connection() {
        Connection con = null;
        String forName = "",portDB="",user="",mdp="";
        try {
            forName = "org.postgresql.Driver";
            portDB = "jdbc:postgresql://localhost:5432/ecole";
            user="ecole";
            mdp = "ecole";
			Class.forName(forName);
			con = DriverManager.getConnection(portDB,user,mdp);
            //System.out.println("connecter");
            return con;
        } catch (Exception e) {
            System.out.println("erreur de connexion");
            return null;
        }
    }
}
