package com.example.demo.Controller;
import com.example.demo.Model.PontoModel;
import com.example.demo.Repository.PontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ponto")
public class PontoController {

    @Autowired
    private PontoRepository repository;

    @GetMapping("/buscar")
    public List<PontoModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public PontoModel buscarporID(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/adicionar")
    public PontoModel adicionar(@RequestBody PontoModel ponto) {
        return repository.save(ponto);
    }

    @PutMapping("/atualizar")
    public PontoModel atualizar(@RequestBody PontoModel ponto) {
        return repository.save(ponto);
    }

    @DeleteMapping("/apagar/{id}")
    public void deletar(@PathVariable int id) {
        repository.deleteById(id);
    }

}
