package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "PRODUTOS")
public class ProdutosModel {

    @Id
    @Column(name = "ID_PRODUTO")
    private int idproduto;

    @Column(name = "NOME_PRODUTO")
    private String nomeProduto;

    @Column(name = "descricao_produto")
    private String descricaoProduto;

    @Column(name = "categoria")
    private String categoria;
    @Column(name = "fabricante")
    private String fabricante;

    @Column(name = "fornecedor")
    private String fornecedor;
    @Column(name = "PRECO_UNITARIO")
    private int precoUnitario;

    @Column(name = "UNIDADES_ESTOQUE")
    private int unidadesEstoque;
}
