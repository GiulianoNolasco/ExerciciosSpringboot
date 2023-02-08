package com.example.demo.controller;

import com.example.demo.model.pessoaModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //controller faz que o spring saiba que essa classe tem rotas para ele listar
public class PessoaController {

    @GetMapping("/pessoa") //anotacao para indicar que é uma rota do tipo get que vai ser acessada pelo pessoa.

    // ResponseEntity é um objeto que vai ser retornado
    // Lispessoamodel é o tipo de dado que vai ser retornado
    // o responseentity transforma a lista em um objeto json com os dados


    public ResponseEntity<List<pessoaModel>> pessoa() {
        List<pessoaModel> pessoas = new ArrayList<>();

        pessoas.add(new pessoaModel(1, "Joao", 50)); //adiciona pessoas usando o construtor de pessoa;
        pessoas.add(new pessoaModel(1, "Joao", 50)); // Igual mas diferente

        return ResponseEntity.ok(pessoas); // da o retorno da lista de pesssoas

    }
}
