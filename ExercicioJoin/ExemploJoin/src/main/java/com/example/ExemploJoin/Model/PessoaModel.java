package com.example.ExemploJoin.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pessoa")
public class PessoaModel {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "nome")

    private String nome;
    @Column(name = "sobrenome")
    private String sobrenome;

    @Column(name = "idade")
    private int idade;

}