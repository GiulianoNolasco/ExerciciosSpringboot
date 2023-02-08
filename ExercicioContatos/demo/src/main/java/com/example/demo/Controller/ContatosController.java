package com.example.demo.Controller;

import com.example.demo.Model.ContatosModel;
import com.example.demo.Repository.ContatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contatos")
public class ContatosController {
    @Autowired
    private ContatosRepository repository;

    @GetMapping("/buscar")
    public List<ContatosModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscarporid/{id}")
    public ContatosModel buscarporid(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PutMapping("/atualizar")
    public ContatosModel atualizar(@RequestBody ContatosModel contato) {
        return repository.save(contato);
    }

    @PostMapping("/adicionar")
    public ContatosModel adicionar(@RequestBody ContatosModel contato) {
        return repository.save(contato);
    }

    @DeleteMapping("/apagar/{id}")
    public void apagar(@PathVariable int id) {
        repository.deleteById(id);
    }

    @GetMapping("/filtrarpornome/{nome}")
    public List<ContatosModel> filtrarpornome(@PathVariable String nome) {
        return repository.findBynome(nome);
    }

}
