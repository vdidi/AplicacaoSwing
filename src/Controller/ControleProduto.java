/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ProdutoDAO;
import Model.Produto;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author vitor
 */
public class ControleProduto {
    
    private static ControleProduto instance;
    
    public static synchronized ControleProduto getInstance(){
        if(instance == null){
            instance = new ControleProduto();
        }
        return instance;
    }
    
    public void cadastrarProduto(String nome, String marca, int qtde, double valor_unit)
    throws SQLException{
        
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setMarca(marca);
        produto.setQtde(qtde);
        produto.setValor_unit(valor_unit);
        
        ProdutoDAO prod = new ProdutoDAO();
        prod.cadastrarProduto(produto);
    }
}
