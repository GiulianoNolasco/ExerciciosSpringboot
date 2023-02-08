package com.example.demo.controller;

import com.example.demo.Repository.FuncionarioRepository;
import com.example.demo.model.FuncionarioModel;
import com.example.demo.model.FuncionarioModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/funcionario")

public class FuncionarioController {
    private com.example.demo.Repository.FuncionarioRepository FuncionarioRepository = new FuncionarioRepository();

    @GetMapping("/buscar")
    public ResponseEntity<List<FuncionarioModel>> getFuncionario() {
        return ResponseEntity.ok(FuncionarioRepository.getfuncionario());
    }

    @PostMapping("/adicionar")
    public void addFuncionario(@RequestBody FuncionarioModel funcionario) {
        FuncionarioRepository.addfuncionario(funcionario);
    }

    @DeleteMapping("/apagar")
    public void deletaFuncionario(@RequestBody FuncionarioModel funcionario) {
        FuncionarioRepository.deletefuncionario(funcionario);
    }

    @PutMapping("/atualizar")
    public void updateFuncionario(@RequestBody FuncionarioModel funcionario) {
        FuncionarioRepository.updatefuncionario(funcionario);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<FuncionarioModel> getFuncionarioById(@PathVariable int id) {
        return ResponseEntity.ok(FuncionarioRepository.getfuncionarioByID(id));
    }

}
