package com.example.demo.Controller;

import com.example.demo.Model.ProdutoModel;
import com.example.demo.Repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/buscar")
    private List<ProdutoModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    private ProdutoModel buscarporID(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/adicionar")
    private ProdutoModel adicionar(@RequestBody @Valid ProdutoModel produto) {
        return repository.save(produto);
    }

    @PutMapping("/atualizar")
    private ProdutoModel atualizar(@RequestBody @Valid ProdutoModel produto) {
        return repository.save(produto);
    }

    @DeleteMapping("/apagar/{id}")
    public void apagar(@PathVariable int id) {
        repository.deleteById(id);
    }
}

