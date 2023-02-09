package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import jdk.jfr.Enabled;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

@Data
@Entity
@Table(name = "EXERCICIO_GIU_PRODUTO")
public class ProdutoModel {

    @Id
    private int id;
    @Size(max = 100, message = "nome com no máximo 100 caracteres.")
    private String nome;
    @Size(max = 250, message = "descricao com no máximo 250 caracteres.")

    private String descricao;
    @Range(min = 1, message = "Valor maior que 0.")
    private int preco;
}
