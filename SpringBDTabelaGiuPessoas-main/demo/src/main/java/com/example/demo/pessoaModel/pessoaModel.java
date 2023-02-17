package com.example.demo.pessoaModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "GIU_PESSOAS")
@Entity
public class pessoaModel {
    @Id
    @Column(name = "PESSOA_ID")
    private int id;

    @Column(name = "NOME_PESSOA")
    private String nome;

    @Column(name = "EMAIL_PESSOA")
    private String email;

    @Column(name = "DATA_NASCIMENTO")
    private String data_nascimento;

    @Column(name = "FK_ID_CIDADE")
    private int fk_cidade;

}
