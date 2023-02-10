package com.example.demo.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "B_CLIENTES_GIUFARMACIA")
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "giu_cli")
    @Column(name = "idcliente")
    private int idCliente;
    @Size(min = 2, max = 100, message = "Tamanho fora do padrao.")
    @Column(name = "nome")
    private String nome;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "telefone")
    private String telefone;

    @Column(name = "ativo")
    private int ativo;
}
