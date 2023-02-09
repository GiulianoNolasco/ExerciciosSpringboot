package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

@Data
@Entity
@Table(name = "EXERCICIO_GIU_PESSOA")
public class PessoaModel {

    @Id
    private int id;
    @Size(max = 100, message = "Tamanho máximo 100 caracteres.")
    private String nome;
    @Email(message = "Email formato inválido")
    private String email;
    @Range(min = 18, message = " Idade mínima 18 anos.")
    private int idade;

}

/*
    Crie uma classe de bean chamada "Pessoa" que tenha as seguintes propriedades:
    nome (obrigatório, tamanho máximo de 100 caracteres),
    idade (obrigatório, valor mínimo de 18 anos) e
    endereço de e-mail (obrigatório, formato de e-mail válido).
    Adicione validações apropriadas para cada propriedade usando as anotações do Hibernate Validator.
    */

