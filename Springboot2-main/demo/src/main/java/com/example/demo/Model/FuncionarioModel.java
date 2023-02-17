package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FuncionarioModel {
    private int id;
    private
    String nome;
    private int idade;
    private int codigoCadastro;
}

