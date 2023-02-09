package com.example.demo.Repository;

import com.example.demo.Model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutosRepository extends JpaRepository<ProdutosModel, Integer> {


    public List<ProdutosModel> findByUnidadeEstoqueGreaterThan(int unidadeEstoque);

    public List<ProdutosModel> findByNomeProdutoContainingIgnoreCase(String nomeProduto);

    public List<ProdutosModel> findByDescricaoProdutoContainingIgnoreCase(String DescricaoProduto);

    public List<ProdutosModel> findBycategoria(String categoria);

    public List<ProdutosModel> findByfornecedor(String fornecedor);

    public List<ProdutosModel> findByfabricante(String fabricante);
}

