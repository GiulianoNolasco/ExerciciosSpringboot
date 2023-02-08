package com.example.demo.controller;

import com.example.demo.Repository.ContatoRepository;
import com.example.demo.model.ContatoModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contato")
public class ContatoController {
    private ContatoRepository ContatoRepository = new ContatoRepository();

    @GetMapping("/buscar")
    public ResponseEntity<List<ContatoModel>> getContato() {
        return ResponseEntity.ok(ContatoRepository.getContato());
    }

    @PostMapping("/adicionar")
    public void addContato(@RequestBody ContatoModel contato) {
        ContatoRepository.addContato(contato);
    }

    @DeleteMapping("/apagar")
    public void deletaContato(@RequestBody ContatoModel contato) {
        ContatoRepository.deleteContato(contato);
    }

    @PutMapping("/atualizar")
    public void updateContato(@RequestBody ContatoModel contato) {
        ContatoRepository.updateContato(contato);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<ContatoModel> getContatoById(@PathVariable int id) {
        return ResponseEntity.ok(ContatoRepository.getcontatoByID(id));
    }

}
