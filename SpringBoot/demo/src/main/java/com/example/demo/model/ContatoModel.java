package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ContatoModel {
    private int id;

    private String nome;
    private int telefone;

}
