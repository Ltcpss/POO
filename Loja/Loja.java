package Loja;

import java.util.ArrayList;

public class Loja {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public void venderProduto(String descricaoProduto) {
        for (Produto produto : listaProdutos) {
            if (produto.getDescricao().equalsIgnoreCase(descricaoProduto)) {
                System.out.println("Venda concluída: " + produto.getDescricao());
                listaProdutos.remove(produto);
                return;
            }
        }
        System.out.println("Produto não encontrado: " + descricaoProduto);
    }
}
