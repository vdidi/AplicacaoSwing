/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author vitor
 */
public class Principal {
    
    public static void main (String[] args){
        
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setSize(600, 400);
        telaInicial.setDefaultCloseOperation(TelaInicial.EXIT_ON_CLOSE);
        telaInicial.setVisible(true);
        
    } 
}
