package com.example.demo.Repository;

import com.example.demo.Model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutosRepository extends JpaRepository<ProdutosModel, Integer> {


    @Query(value = "SELECT * FROM PRODUTOS WHERE UNIDADES_ESTOQUE >0", nativeQuery = true)
    public List<ProdutosModel> findByUNIDADES_ESTOQUE();

    @Query(value = "SELECT * FROM PRODUTOS WHERE UPPER(NOME_PRODUTO) =?1", nativeQuery = true)
    public List<ProdutosModel> findByNOME_PRODUTO(String NOME_PRODUTO);

    @Query(value = "SELECT * FROM PRODUTOS WHERE UPPER(descricao_produto) =UPPER(?1) ", nativeQuery = true)
    public List<ProdutosModel> findBydescricao_produto(String descricao_produto);

    public List<ProdutosModel> findBycategoria(String categoria);

    public List<ProdutosModel> findByfornecedor(String fornecedor);

    public List<ProdutosModel> findByfabricante(String fabricante);
}
