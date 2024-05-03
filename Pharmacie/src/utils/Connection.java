package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private static Connection con;
    
    public static Connection seConnecter(){
        if(con == null ){
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zouuPharmacie", "root", "");
                System.out.println("Connexion etablie....");
            }catch(SQLException ex){
                System.out.println("db non trouve ..."+ex.getMessage());
            }
        }
        return con;
    }
}
