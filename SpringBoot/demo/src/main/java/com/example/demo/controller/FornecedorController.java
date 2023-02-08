package com.example.demo.controller;

import com.example.demo.Repository.FornecedorRepository;
import com.example.demo.model.FornecedorModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {
    private FornecedorRepository FornecedorRepository = new FornecedorRepository();

    @GetMapping("/buscar")
    public ResponseEntity<List<FornecedorModel>> getFornecedor() {
        return ResponseEntity.ok(FornecedorRepository.getFornecedor());
    }

    @PostMapping("/adicionar")
    public void addFornecedor(@RequestBody FornecedorModel fornecedor) {
        FornecedorRepository.addFornecedor(fornecedor);
    }

    @DeleteMapping("/apagar")
    public void deletaFornecedor(@RequestBody FornecedorModel fornecedor) {
        FornecedorRepository.deleteFornecedor(fornecedor);
    }

    @PutMapping("/atualizar")
    public void updateFornecedor(@RequestBody FornecedorModel fornecedor) {
        FornecedorRepository.updateFornecedor(fornecedor);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<FornecedorModel> getFornecedorById(@PathVariable int id) {
        return ResponseEntity.ok(FornecedorRepository.getFornecedorByID(id));
    }

}
