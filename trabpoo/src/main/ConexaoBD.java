package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBD {
    private Connection c;
    
    public ConexaoBD(String url, String user, String pass){
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(url, user, pass);
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public int insert(String comando){
        try{
            PreparedStatement stm = this.c.prepareStatement(comando);
            return stm.executeUpdate();
        } catch(SQLException e){
            System.out.println("catch ConexaoBD insert: " + e.getMessage());
            return 0;
        }
    }
    
    public ResultSet select(String comando){
        try{
            Statement stm = c.createStatement();
            ResultSet resultado = stm.executeQuery(comando);
            return resultado;
        } catch(SQLException e){
            return null;
        }
    }
}
