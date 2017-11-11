package Model;

/**
 *
 * @author vitor
 */
public class Produto {
    
    private int id;
    private String nome;
    private String marca;
    private int qtde;
    private double valor_unit;

    //construtor
    public Produto(int id, String nome, String marca, int qtde, double valor_unit) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.qtde = qtde;
        this.valor_unit = valor_unit;
    }

    // gets e sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getValor_unit() {
        return valor_unit;
    }

    public void setValor_unit(double valor_unit) {
        this.valor_unit = valor_unit;
    }
    
}
