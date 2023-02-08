package com.example.demo.controller;

import com.example.demo.Repository.TarefasRepository;
import com.example.demo.model.TarefasModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefasController {
    private com.example.demo.Repository.TarefasRepository TarefasRepository = new TarefasRepository();

    @GetMapping("/buscar")
    public ResponseEntity<List<TarefasModel>> getTarefas() {
        return ResponseEntity.ok(TarefasRepository.getTarefas());
    }

    @PostMapping("/adicionar")
    public void addTarefas(@RequestBody TarefasModel Tarefas) {
        TarefasRepository.addTarefas(Tarefas);
    }

    @DeleteMapping("/apagar")
    public void deletaTarefas(@RequestBody TarefasModel Tarefas) {
        TarefasRepository.deleteTarefas(Tarefas);
    }

    @PutMapping("/atualizar")
    public void updateTarefas(@RequestBody TarefasModel Tarefas) {
        TarefasRepository.updateTarefas(Tarefas);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<TarefasModel> getTarefasById(@PathVariable int id) {
        return ResponseEntity.ok(TarefasRepository.gettarefaByID(id));
    }

}
