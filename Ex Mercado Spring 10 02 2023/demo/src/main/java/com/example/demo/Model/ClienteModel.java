package com.example.demo.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "A_GIU_CLIENTES")
public class ClienteModel {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY,generator= "giu_cli")
    @SequenceGenerator(name="SEQ_A_GIU_CLIENTES", sequenceName="SEQ_A_GIU_CLIENTES")
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
