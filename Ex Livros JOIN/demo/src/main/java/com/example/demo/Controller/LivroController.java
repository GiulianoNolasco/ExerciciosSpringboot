package com.example.demo.Controller;

import com.example.demo.Model.LivroModel;
import com.example.demo.Repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private LivroRepository repository;

    @GetMapping("/buscar")
    public List<LivroModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public LivroModel buscarporID(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/adicionar")
    public LivroModel adicionar(@RequestBody LivroModel livro) {
        return repository.save(livro);
    }

    @PutMapping("/atualizar")
    public LivroModel atualizar(@RequestBody LivroModel livro) {
        return repository.save(livro);
    }

    @DeleteMapping("/apagar/{id}")
    public void apagar(@PathVariable int id) {
        repository.deleteById(id);
    }


}
