package DAO;

import Gestion.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.TreeSet;

public class DAOClient {
    static Connection cn = LaConnexion.seConnecter();
    
    public static ArrayList<Client> lister(){
        ArrayList<Client> cl = new ArrayList<>();
        
        String req = "SELECT * FROM client ;";
        String codeCli, nomCli , adresseCli , emailCli;
        
        Client c;
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(req);
            while(rs.next()){
                codeCli = rs.getString(1);
                nomCli = rs.getString(2);
                adresseCli = rs.getString(3);
                emailCli = rs.getString(4);
                c = new Client(codeCli,nomCli,adresseCli,emailCli);
                cl.add(c);
           }
            System.out.println("consultation ok...");
        }catch(SQLException e){
            System.out.println("Probleme de consultation ...");
        }
        
        return cl;
    }
    
    public static TreeSet<Client> listerVille(String ville){
        TreeSet<Client> cl = new TreeSet<>();
        
        String req = "SELECT * FROM client  WHERE `adresseCli` = '"+ville+"';";
        String codeCli, nomCli , adresseCli , emailCli;
        System.out.println(req);
        Client c;
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(req);

            while(rs.next()){
                codeCli = rs.getString(1);
                nomCli = rs.getString(2);
                adresseCli = rs.getString(3);
                emailCli = rs.getString(4);
                c = new Client(codeCli,nomCli,adresseCli,emailCli);
                cl.add(c);
           }
            System.out.println("consultation ok...");
        }catch(SQLException e){
            System.out.println("Probleme de consultation ...");
        }
        
        return cl;
    }
    
    public static Client chercher(String codeCli){        
        String req = "SELECT * FROM client  WHERE `codeCli` = '"+codeCli+"';";
        System.out.println(req);
        Client c = null;
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(req);

            while(rs.next()){
                c = new Client(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
           }
            System.out.println("consultation ok...");
        }catch(SQLException e){
            System.out.println("Probleme de consultation ...");
        }
        
        return c;
    }
    
    public static boolean ajouter(Client c){        
        String req = "INSERT INTO `client` (`codeCli`, `nomCli`, `adresseCli`, `emailCli`) VALUES ('?', '?', '?', '?');";
        
        try{
            PreparedStatement ps = cn.prepareStatement(req);
            ps.setString(1, c.getCodeCli());
            ps.setString(2, c.getNomCli());
            ps.setString(3, c.getAdresseCli());
            ps.setString(4, c.getEmailCli());

            ps.executeUpdate(req);
            
            System.out.println("consultation ok...");
            ps.close();
            return true;
        }catch(SQLException e){
            System.out.println("Probleme de consultation ...");
        }
        
        return false;
    }
    
    public static boolean changerAdress(Client c , String nvAdresse){
        
        return true;
    }
    
}
