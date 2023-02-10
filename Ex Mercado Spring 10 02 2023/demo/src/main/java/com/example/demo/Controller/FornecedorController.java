package com.example.demo.Controller;

import com.example.demo.Model.FornecedorModel;
import com.example.demo.Repository.FornecedorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {

    @Autowired
    private FornecedorRepository repository;

    @GetMapping("/buscar")
    private List<FornecedorModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    private FornecedorModel buscarporID(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/adicionar")
    private FornecedorModel adicionar(@RequestBody @Valid FornecedorModel fornecedor) {
        return repository.save(fornecedor);
    }

    @PutMapping("/atualizar")
    private FornecedorModel atualizar(@RequestBody @Valid FornecedorModel fornecedor) {
        return repository.save(fornecedor);
    }

    @DeleteMapping("/apagar/{id}")
    public void apagar(@PathVariable int id) {
        repository.deleteById(id);
    }
}
