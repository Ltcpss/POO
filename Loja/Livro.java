package Loja;

public class Livro extends Produto{
    final private int numeroDePaginas;

    public Livro(float preco, String descricao, String marca, int numeroDePaginas){
        super(preco, descricao, marca);
        this.numeroDePaginas = numeroDePaginas;
    }
}
