package com.example.demo.Controller;

import com.example.demo.Model.PessoaModel;
import com.example.demo.Repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {


    @Autowired
    private PessoaRepository repository;

    @GetMapping("/buscar")
    public List<PessoaModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscarporid/{id}")
    public PessoaModel buscarporid(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PutMapping("/atualizar")
    public PessoaModel atualizar(@RequestBody @Validated PessoaModel pessoa) {
        return repository.save(pessoa);
    }

    @PostMapping("/adicionar")
    public PessoaModel adicionar(@RequestBody @Validated PessoaModel pessoa) {
        return repository.save(pessoa);
    }

    @DeleteMapping("/apagar/{id}")
    public void apagar(@PathVariable int id) {
        repository.deleteById(id);
    }

}
