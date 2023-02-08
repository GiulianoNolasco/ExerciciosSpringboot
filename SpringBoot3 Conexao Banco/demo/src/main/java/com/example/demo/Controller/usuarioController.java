package com.example.demo.Controller;

import com.example.demo.Model.usuarioModel;
import com.example.demo.Repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class usuarioController {

    @Autowired
    private usuarioRepository repository;

    @GetMapping("/buscar")
    public List<usuarioModel> buscarTodos() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public usuarioModel buscarPorId(@PathVariable int id) {
        return repository.findById(id).get();
    }


    @PutMapping("/atualizar")
    public usuarioModel atualizar(@RequestBody usuarioModel usuario) {
        return repository.save(usuario);
    }

    @PostMapping("/adicionar")
    public usuarioModel salvar(@RequestBody usuarioModel usuario) {
        return repository.save(usuario);
    }

    @DeleteMapping("/apagar/{id}")
    public void deletar(@PathVariable int id) {
        repository.deleteById(id);
    }

    @GetMapping("/buscarporCPF/{CPF}")
    public usuarioModel buscarPorCPF(@PathVariable String CPF) {
        return repository.findByCPF(CPF);
    }

    @GetMapping("/buscarpornome/{NOME}")
    public List<usuarioModel> buscarPornome(@PathVariable String NOME) {
        return repository.findByNOME(NOME);
    }

    @GetMapping("/buscarpessoanomejava")
    public List<usuarioModel> buscarpessoanomejava() {
        return repository.encontrapessoajava();
    }


    @GetMapping("/pesquisaPorCaracteristicas/{NOME}/{SEXO}/{TIPO_SANGUINEO}")
    public List<usuarioModel> pesquisaPorCaracteristicas(@PathVariable String NOME, @PathVariable String SEXO, @PathVariable String TIPO_SANGUINEO) {
        return repository.pesquisaPorCaracteristicas(NOME,SEXO,TIPO_SANGUINEO);
    }


    @GetMapping("/pesquisarMaiorDeIdade")
    public List<usuarioModel> pesquisarMaiorDeIdade() {
        return repository.pesquisarMaiorDeIdade();
    }
}