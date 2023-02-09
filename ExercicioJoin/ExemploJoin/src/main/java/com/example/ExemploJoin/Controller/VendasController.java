package com.example.ExemploJoin.Controller;

import com.example.ExemploJoin.Model.VendaModel;
import com.example.ExemploJoin.Repository.PessoaRepository;
import com.example.ExemploJoin.Repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendasController {

    @Autowired
    private VendaRepository repository;

    @GetMapping("/buscar")
    public List<VendaModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscarporid/{id}")
    public VendaModel buscarpotId(@PathVariable long id) {
        return repository.findById(id).get();
    }

    @PutMapping("/atualizar")
    public VendaModel atualizar(@RequestBody @Validated VendaModel venda) {
        return repository.save(venda);
    }

    @PostMapping("/adicionar")
    public VendaModel adicionar(@RequestBody @Validated VendaModel venda) {
        return repository.save(venda);
    }

    @DeleteMapping("/apagar/{id}")
    public void apagar(@PathVariable long id) {
        repository.deleteById(id);
    }
}
