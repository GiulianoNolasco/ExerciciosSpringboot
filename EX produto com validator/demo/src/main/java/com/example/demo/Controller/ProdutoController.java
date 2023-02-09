package com.example.demo.Controller;

import com.example.demo.Model.ProdutoModel;
import com.example.demo.Repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private PessoaRepository repository;

    @GetMapping("/buscar")
    public List<ProdutoModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscarporid/{id}")
    public ProdutoModel buscarporid(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/adicionar")
    public ProdutoModel adicionar(@RequestBody @Validated ProdutoModel produto) {
        return repository.save(produto);
    }

    @PutMapping("/atualizar")
    public ProdutoModel atualizar(@RequestBody @Validated ProdutoModel produto) {
        return repository.save(produto);
    }

    @DeleteMapping("/apagar/{id}")
    public void apagar(@PathVariable int id) {
        repository.deleteById(id);
    }
}
