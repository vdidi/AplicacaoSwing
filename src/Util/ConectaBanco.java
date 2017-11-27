/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class ConectaBanco {
    
    public static Connection getConexao() throws SQLException{
        Connection conexao = null;
        try {
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AppSwing", "postgres", "123");
        } catch (ClassNotFoundException erro){
            JOptionPane.showMessageDialog(null, "Banco de dados não encontrado!");
        }
        return conexao;
    }
}
