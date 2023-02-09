package com.example.demo.Controller;

import com.example.demo.Model.ProdutosModel;
import com.example.demo.Repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {
    @Autowired
    private ProdutosRepository repository;

    @GetMapping("/buscar")
    public List<ProdutosModel> buscar() {
        return repository.findAll();
    }

    @GetMapping("/buscarporid/{id}")
    public ProdutosModel buscarporid(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PutMapping("/atualizar")
    public ProdutosModel atualizar(@RequestBody ProdutosModel produto) {
        return repository.save(produto);
    }

    @PostMapping("/adicionar")
    public ProdutosModel adicionar(@RequestBody ProdutosModel produto) {
        if (produto.getPrecoUnitario() > 0
                && produto.getNomeProduto().length() >= 4
                && produto.getNomeProduto().length() <= 100
                && produto.getCategoria() != "") {
            return repository.save(produto);
        }
        return null;
    }

    @DeleteMapping("/apagar/{id}")
    public void apagar(@PathVariable int id) {
        repository.deleteById(id);
    }

    @GetMapping("/buscarprodutosestoqueacimadezero")
    public List<ProdutosModel> filtrarporstatus() {
        return repository.findByUnidadeEstoqueGreaterThan(0);
    }

    @GetMapping("/buscarpornomeproduto/{nomeProduto}")
    public List<ProdutosModel> buscarpornomeproduto(@PathVariable String nomeProduto) {
        return repository.findByNomeProdutoContainingIgnoreCase(nomeProduto);
    }

    @GetMapping("/buscarpordescricaoproduto/{DescricaoProduto}")
    public List<ProdutosModel> filtrarpordescricaoproduto(@PathVariable String DescricaoProduto) {
        return repository.findByDescricaoProdutoContainingIgnoreCase(DescricaoProduto);
    }

    @GetMapping("/buscarporcategoria/{categoria}")
    public List<ProdutosModel> filtrarporcategoria(@PathVariable String categoria) {
        return repository.findBycategoria(categoria);
    }

    @GetMapping("/buscarporfornecedor/{fornecedor}")
    public List<ProdutosModel> filtrarporfornecedor(@PathVariable String fornecedor) {
        return repository.findByfornecedor(fornecedor);
    }

    @GetMapping("/buscarporfabricante/{fabricante}")
    public List<ProdutosModel> filtrarporfabricante(@PathVariable String fabricante) {
        return repository.findByfabricante(fabricante);
    }

}
