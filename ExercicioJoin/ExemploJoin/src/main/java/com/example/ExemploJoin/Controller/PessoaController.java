package com.example.ExemploJoin.Controller;

import com.example.ExemploJoin.Model.PessoaModel;
import com.example.ExemploJoin.Repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @GetMapping("/buscar")
    public List<PessoaModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscarporid/{id}")
    public PessoaModel buscarpotId(@PathVariable long id) {
        return repository.findById(id).get();
    }

    @PutMapping("/atualizar")
    public PessoaModel atualizar(@RequestBody PessoaModel pessoa) {
        return repository.save(pessoa);
    }

    @PostMapping("/adicionar")
    public PessoaModel adicionar(@RequestBody PessoaModel pessoa) {
        return repository.save(pessoa);
    }

    @DeleteMapping("/apagar/{id}")
    public void apagar(@PathVariable long id) {
        repository.deleteById(id);
    }
}
