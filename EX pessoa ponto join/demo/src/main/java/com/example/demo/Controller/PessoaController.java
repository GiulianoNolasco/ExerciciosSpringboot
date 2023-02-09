package com.example.demo.Controller;

import com.example.demo.Model.PessoaModel;
import com.example.demo.Repository.PessoaRepository;
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

    @GetMapping("/buscar/{id}")
    public PessoaModel buscarporID(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/adicionar")
    public PessoaModel adicionar(@RequestBody PessoaModel pessoa) {
        return repository.save(pessoa);
    }

    @PutMapping("/atualizar")
    public PessoaModel atualizar(@RequestBody PessoaModel pessoa) {
        return repository.save(pessoa);
    }

    @DeleteMapping("/apagar/{id}")
    public void deletar(@PathVariable int id) {
        repository.deleteById(id);
    }

}
