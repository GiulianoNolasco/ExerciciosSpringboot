package com.example.demo.Controller;

import com.example.demo.Model.ClienteModel;
import com.example.demo.Repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping("/buscar")
    private List<ClienteModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    private ClienteModel buscarporID(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/adicionar")
    private ClienteModel adicionar(@RequestBody @Valid ClienteModel cliente) {
        return repository.save(cliente);
    }

    @PutMapping("/atualizar")
    private ClienteModel atualizar(@RequestBody @Valid ClienteModel cliente) {
        return repository.save(cliente);
    }

    @DeleteMapping("/apagar/{id}")
    public void apagar(@PathVariable int id) {
        repository.deleteById(id);
    }
}
