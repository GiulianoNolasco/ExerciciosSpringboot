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
@Table(name = "A_GIU_FORNECEDORES")
public class FornecedorModel {

    @Id
    @Column(name = "id_fornecedor")
    private int idFornecedor;
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
