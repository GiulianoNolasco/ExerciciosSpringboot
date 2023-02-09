package com.example.demo.Controller;

import com.example.demo.Model.AluguelModel;
import com.example.demo.Repository.AluguelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluguel")
public class AluguelController {
    @Autowired
    private AluguelRepository repository;

    @GetMapping("/buscar")
    public List<AluguelModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public AluguelModel buscarporID(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/adicionar")
    public AluguelModel adicionar(@RequestBody AluguelModel aluguel) {
        return repository.save(aluguel);
    }

    @PutMapping("/atualizar")
    public AluguelModel atualizar(@RequestBody AluguelModel aluguel) {
        return repository.save(aluguel);
    }

    @DeleteMapping("/apagar/{id}")
    public void apagar(@PathVariable int id) {
        repository.deleteById(id);
    }

}

