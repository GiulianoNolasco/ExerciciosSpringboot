package com.example.demo.Controller;

import com.example.demo.Model.FilmesModel;
import com.example.demo.Repository.FilmesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmesController {
    @Autowired
    private FilmesRepository repository;

    @GetMapping("/buscar")
    public List<FilmesModel> buscarTodos() {
        return repository.findAll();
    }

    @GetMapping("/buscar/{id}")
    public FilmesModel buscarPorId(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PutMapping("/atualizar")
    public FilmesModel atualizar(@RequestBody FilmesModel filme) {
        return repository.save(filme);
    }

    @PostMapping("/adicionar")
    public FilmesModel salvar(@RequestBody FilmesModel filme) {
        return repository.save(filme);
    }

    @DeleteMapping("/apagar/{id}")
    public void deletar(@PathVariable int id) {
        repository.deleteById(id);
    }
/*
    @GetMapping("/buscarfilmesdoano2023")
    public List<FilmesModel> buscarfilmesdoano2023() {
        return repository.buscarfilmesdoano2023();
    }
*/

    @GetMapping("/pesquisapais/{PAIS_ORIGEM}")
    public List<FilmesModel> pesquisaPorPais(@PathVariable String PAIS_ORIGEM) {
        return repository.pesquisaPorPAIS_ORIGEM(PAIS_ORIGEM);
    }


    @GetMapping("/pesquisadatalancamento/{DATA_LANCAMENTO}")
    public List<FilmesModel> pesquisaPorDataLancamento(@PathVariable int DATA_LANCAMENTO) {
        return repository.pesquisaPorDATA_LANCAMENTO(DATA_LANCAMENTO);
    }


    @GetMapping("/pesquisarPorQtVendas")
    public List<FilmesModel> pesquisaPorDataLancamento() {
        return repository.pesquisarPorQtVendas();
    }


    @GetMapping("/pesquisarMaiorDeIdade")
    public List<FilmesModel> pesquisarMaiorDeIdade() {
        return repository.pesquisarMaiorDeIdade();
    }

}
