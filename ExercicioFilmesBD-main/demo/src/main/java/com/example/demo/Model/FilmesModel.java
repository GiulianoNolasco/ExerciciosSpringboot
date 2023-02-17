package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "EXERCICIO_FILME")
@Entity
public class FilmesModel {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "DATA_LANCAMENTO")
    private int data;
    @Column(name = "QUANTIDADE_VENDAS")
    private int QTVendas;

    @Column(name = "PAIS_ORIGEM")
    private String PAIS_ORIGEM;
}
