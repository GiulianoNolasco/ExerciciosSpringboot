package com.example.demo.controller;

import com.example.demo.Repository.ProdutoRepository;
import com.example.demo.model.ProdutoModel;
import com.example.demo.model.ProdutoModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private com.example.demo.Repository.ProdutoRepository ProdutoRepository = new ProdutoRepository();

    @GetMapping("/buscar")
    public ResponseEntity<List<ProdutoModel>> getProduto() {
        return ResponseEntity.ok(ProdutoRepository.getProduto());
    }

    @PostMapping("/adicionar")
    public void addProduto(@RequestBody ProdutoModel Produto) {
        ProdutoRepository.addProduto(Produto);
    }

    @DeleteMapping("/apagar")
    public void deletaProduto(@RequestBody ProdutoModel Produto) {
        ProdutoRepository.deleteProduto(Produto);
    }

    @PutMapping("/atualizar")
    public void updateProduto(@RequestBody ProdutoModel Produto) {
        ProdutoRepository.updateProduto(Produto);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<ProdutoModel> getProdutoById(@PathVariable int id) {
        return ResponseEntity.ok(ProdutoRepository.getProdutoByID(id));
    }

}
