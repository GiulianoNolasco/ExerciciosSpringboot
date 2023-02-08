package com.example.demo.Controller;

import com.example.demo.Model.LivrosModel;
import com.example.demo.Repository.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivrosController {
    @Autowired
    private LivrosRepository repository;

    @GetMapping("/buscar")
    public List<LivrosModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscarporid/{id}")
    public LivrosModel buscarporid(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PutMapping("/atualizar")
    public LivrosModel atualizar(@RequestBody LivrosModel produto) {
        return repository.save(produto);
    }

    @PostMapping("/adicionar")
    public LivrosModel adicionar(@RequestBody LivrosModel produto) {
        return repository.save(produto);
    }

    @DeleteMapping("/apagar/{id}")
    public void apagar(@PathVariable int id) {
        repository.findById(id);
    }

}
