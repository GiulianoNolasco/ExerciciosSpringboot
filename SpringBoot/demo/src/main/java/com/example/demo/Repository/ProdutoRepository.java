package com.example.demo.Repository;
import com.example.demo.model.ProdutoModel;
import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    List<ProdutoModel> produtos = new ArrayList<>();

    public ProdutoRepository() {
        produtos.add(new ProdutoModel(1,"teste",2.58));
        produtos.add(new ProdutoModel(2,"dois",254.9));
        produtos.add(new ProdutoModel(3,"tres",698.54));
        produtos.add(new ProdutoModel(4,"quatro",698.54));
        produtos.add(new ProdutoModel(5,"cinco",48.54));
    }

    public void addProduto(ProdutoModel Produto) {
        produtos.add(Produto);
    }

    public List<ProdutoModel> getProduto() {
        return produtos;
    }

    public void deleteProduto(ProdutoModel Produto) {
        produtos.remove(Produto);
    }

    public void updateProduto(ProdutoModel Produto) {
        for (ProdutoModel c : produtos) {
            if (c.getId() == Produto.getId()) {
                c.setNome(Produto.getNome());
                c.setPreco(Produto.getPreco());
            }
        }
    }

    public ProdutoModel getProdutoByID(int id) {
        for (ProdutoModel c : produtos) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }


}
