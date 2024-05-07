package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LaConnexion {
    private static Connection con;
    private static String user;
    private static String password;
    
    public static Connection seConnecter(){
        if(con == null ){
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tpjavacnxdb2", "root", "");
                System.out.println("Connexion etablie....");
            }catch(SQLException ex){
                System.out.println("db non trouve ..."+ex.getMessage());
            }
        }
        return con;
    }
}
