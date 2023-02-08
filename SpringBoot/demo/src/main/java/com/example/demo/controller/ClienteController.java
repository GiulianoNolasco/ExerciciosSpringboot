package com.example.demo.controller;

import com.example.demo.Repository.ClienteRepository;
import com.example.demo.model.ClienteModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private ClienteRepository ClienteRepository = new ClienteRepository();

    @GetMapping("/buscar")
    public ResponseEntity<List<ClienteModel>> getCliente() {
        return ResponseEntity.ok(ClienteRepository.getCliente());
    }

    @PostMapping("/adicionar")
    public void addCliente(@RequestBody ClienteModel cliente) {
        ClienteRepository.addCliente(cliente);
    }

    @DeleteMapping("/apagar")
    public void deletaCliente(@RequestBody ClienteModel cliente) {
        ClienteRepository.deleteCliente(cliente);
    }

    @PutMapping("/atualizar")
    public void updateCliente(@RequestBody ClienteModel cliente) {
        ClienteRepository.updateCliente(cliente);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<ClienteModel> getClienteById(@PathVariable int id) {
        return ResponseEntity.ok(ClienteRepository.getclienteByID(id));
    }

}
