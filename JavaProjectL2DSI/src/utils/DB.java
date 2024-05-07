package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private static Connection cnn;
    
    public static Connection connection() {
        if(cnn == null){
            try {
                cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zouupharmacie", "root", "");
                System.out.println("Connected to the database");
            }catch(SQLException e){
                System.out.println("Error connecting to the database: " + e.getMessage());
            }
        }
        return cnn;
    }
}
