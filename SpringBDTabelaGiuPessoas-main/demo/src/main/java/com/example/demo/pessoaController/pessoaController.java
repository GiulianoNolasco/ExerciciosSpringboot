package com.example.demo.pessoaController;

import com.example.demo.pessoaModel.pessoaModel;
import com.example.demo.pessoaRepository.pessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class pessoaController {

    @Autowired
    private pessoaRepository repository;

    @GetMapping("/buscar")
    public List<pessoaModel> buscarTodos() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public pessoaModel buscarPorId(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @DeleteMapping("/apagar/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        return repository.findById(id)
                .map(record -> {
                    repository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/adicionar")
    public pessoaModel addPessoa(@RequestBody pessoaModel pessoa) {
        return repository.save(pessoa);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity update(@PathVariable("id") int id, @RequestBody pessoaModel pessoa) {
        return repository.findById(id)
                .map(record -> {
                    record.setNome(pessoa.getNome());
                    record.setEmail(pessoa.getEmail());
                    record.setData_nascimento(pessoa.getData_nascimento());
                    record.setFk_cidade(pessoa.getFk_cidade());
                    pessoaModel updated = repository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }
}