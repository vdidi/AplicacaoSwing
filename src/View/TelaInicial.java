package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author vitor
 */
public class TelaInicial extends JFrame {
    
    public TelaInicial(){
        super("Tela Inicial");
        menuTela();
        initComponents();
    }
    
    private void menuTela(){
        
        JMenu opcoes = new JMenu("Opções");
        JMenuItem sair = new JMenuItem("Sair");
        
        opcoes.add(sair);
        
        JMenuBar barra = new JMenuBar();
        
        setJMenuBar(barra);
        barra.add(opcoes);
        barra.setVisible(true);
    }
    
    private void initComponents(){
        setLayout(new BorderLayout());
        JPanel painel = new JPanel();
        
        painel.setLayout(new FlowLayout());
        
        JButton btnCadastro = new JButton("Cadastrar Cliente");
        
        painel.add(btnCadastro);
        
        add(painel, BorderLayout.LINE_START);
        
    }
}
