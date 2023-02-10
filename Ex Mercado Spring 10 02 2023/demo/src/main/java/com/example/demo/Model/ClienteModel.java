package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "A_GIU_CLIENTES")
public class ClienteModel {
    @Id
    @Column(name = "id_cliente")
    private int idCliente;
    @Size(min = 2, max = 100, message = "Tamanho fora do padrao.")
    @Column(name = "nome")
    private String nome;
    @NotBlank
    @Column(name = "endereco")
    private String endereco;
    @NotBlank
    @Column(name = "telefone")
    private String telefone;


}
