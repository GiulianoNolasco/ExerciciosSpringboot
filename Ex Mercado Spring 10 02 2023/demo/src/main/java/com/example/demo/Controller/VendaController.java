package com.example.demo.Controller;

import com.example.demo.Model.VendaModel;
import com.example.demo.Repository.ProdutoRepository;
import com.example.demo.Repository.VendaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaController {

    @Autowired
    private VendaRepository repository;

    @GetMapping("/buscar")
    private List<VendaModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    private VendaModel buscarporID(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping("/adicionar")
    private VendaModel adicionar(@RequestBody @Valid VendaModel venda) {
        return repository.save(venda);
    }

    @PutMapping("/atualizar")
    private VendaModel atualizar(@RequestBody @Valid VendaModel venda) {
        return repository.save(venda);
    }

    @DeleteMapping("/apagar/{id}")
    public void apagar(@PathVariable int id) {
        repository.deleteById(id);
    }
}
