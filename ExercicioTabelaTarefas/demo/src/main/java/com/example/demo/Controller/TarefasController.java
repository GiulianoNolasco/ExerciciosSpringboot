package com.example.demo.Controller;

import com.example.demo.Model.TarefasModel;
import com.example.demo.Repository.TarefasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefasController {
    @Autowired
    private TarefasRepository repository;

    @GetMapping("/buscar")
    public List<TarefasModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscarporid/{id}")
    public TarefasModel buscarporid(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PutMapping("/atualizar")
    public TarefasModel atualizar(@RequestBody TarefasModel tarefa) {
        return repository.save(tarefa);
    }

    @PostMapping("/adicionar")
    public TarefasModel adicionar(@RequestBody TarefasModel tarefa) {
        return repository.save(tarefa);
    }

    @DeleteMapping("/apagar/{id}")
    public void apagar(@PathVariable int id) {
        repository.findById(id);
    }

    @GetMapping("/filtrarporstatus/{status}")
    public List<TarefasModel> filtrarporstatus(@PathVariable String status) {
        return repository.findBystatus(status);
    }

    @GetMapping("/filtrarporprioridade/{prioridade}")
    public List<TarefasModel> filtrarporprioridade(@PathVariable String prioridade) {
        return repository.findByprioridade(prioridade);
    }
}
