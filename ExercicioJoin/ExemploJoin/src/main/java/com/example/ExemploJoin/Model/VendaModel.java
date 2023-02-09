package com.example.ExemploJoin.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "vendas_lucas")
public class VendaModel {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "nome_comprador")
    private String nomeComprador;

    @ManyToOne
    @JoinColumn(name = "id_pessoa", referencedColumnName = "id")
    private PessoaModel idPessoa;
}
