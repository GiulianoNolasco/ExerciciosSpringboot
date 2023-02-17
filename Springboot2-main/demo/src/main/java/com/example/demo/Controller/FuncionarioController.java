package com.example.demo.Controller;

import com.example.demo.Model.FuncionarioModel;
import com.example.demo.Repository.FuncionarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    private FuncionarioRepository FuncionarioRepository = new FuncionarioRepository();

    @GetMapping("/buscar")
    public ResponseEntity<List<FuncionarioModel>> getFuncionarios() {
        return ResponseEntity.ok(FuncionarioRepository.getFuncionario());
    }

    @PostMapping("/adicionar")
    public void addFuncionario(@RequestBody FuncionarioModel funcionario) {
        FuncionarioRepository.addFuncionario(funcionario);
    }

    @DeleteMapping("/apagar")
    public void deletaFuncionario(@RequestBody FuncionarioModel funcionario) {
        FuncionarioRepository.deleteFuncionario(funcionario);
    }

    @PutMapping("/atualizar")
    public void updateFuncionario(@RequestBody FuncionarioModel funcionario) {
        FuncionarioRepository.updateFuncionario(funcionario);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<FuncionarioModel> getFuncionarioByID(@PathVariable int id) {
        return ResponseEntity.ok(FuncionarioRepository.getFuncionarioByID(id));
    }
}
