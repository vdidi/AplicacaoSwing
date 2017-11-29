/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Produto;
import Util.ConectaBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class ProdutoDAO {
    
    private static final String INSERT = "Insert INTO produto (nome, marca, qtde, valor_unit) values (?, ?, ?, ?)";
    
    public boolean cadastrarProduto (Produto produto) {
        Connection conexao = null;
        
        try {
            conexao = ConectaBanco.getConexao();
            /* PreparedStatment é a forma mais segura de inserção de dados num BD, preparando
            os itens a serem inseridos, evitando um ataque de sql injection
            */
            PreparedStatement pstmt = conexao.prepareStatement(INSERT);
            
            pstmt.setString(1, produto.getNome());
            pstmt.setString(2, produto.getMarca());
            pstmt.setInt(3, produto.getQtde());
            pstmt.setDouble(4, produto.getValor_unit());
            pstmt.execute();
            pstmt.close();
            
        } catch (Exception erro){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + erro.getMessage(), "Conexão", 3);
        }
        return true;
    }
}
