package Loja;

public class Produto {
    // Atributos
    private float preco;
    private String descricao;
    private String marca;

    // Métodos
    public Produto(float preco, String descricao, String marca){
        this.preco = preco;
        this.descricao = descricao;
        this.marca = marca;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
