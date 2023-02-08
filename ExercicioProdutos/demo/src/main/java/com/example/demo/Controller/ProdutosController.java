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


//    Ao cadastrar:
//    O preco deve ser superior a 0;
//    O produto deve ter no minimo 4 caracteres e no maximo 100;
//    A Categoria nao pode estar vazia;
//    nao pode cadastrar produto com unidades_estoque menor que 1;

//public void cadastrar(@RequestBody produtosModel produto){
//        if (produto.getNome_Produto().lenght > 4


    @PostMapping("/adicionar")
    public ProdutosModel adicionar(@RequestBody ProdutosModel produto) {
        if (produto.getPrecounitario() > 0
                && produto.getNomeproduto().length() >= 4
                && produto.getNomeproduto().length() <= 100
                && produto.getCategoria() != "") {
            return repository.save(produto);
        }
            return null;

    }

    @DeleteMapping("/apagar/{id}")
    public void apagar(@PathVariable int id) {
        repository.findById(id);
    }

    //    Somente os produtos com estoque superior a 0(Criar um get separado);
    @GetMapping("/buscarprodutosestoqueacimadezero")
    public List<ProdutosModel> filtrarporstatus() {
        return repository.findByUNIDADES_ESTOQUE();
    }

    //    Buscar por nome_produto usando o like do sql e ignorando o case usando o UPPER(Criar um get separado);
    @GetMapping("/buscarpornomeproduto/{NOME_PRODUTO}")
    public List<ProdutosModel> buscarpornomeproduto(@PathVariable String NOME_PRODUTO) {
        return repository.findByNOME_PRODUTO(NOME_PRODUTO);
    }

//    Buscar por descricao usando o like do sql e ignorando o case usando o UPPER(Criar um get separado);

    @GetMapping("/buscarpordescricaoproduto/{descricao_produto}")
    public List<ProdutosModel> filtrarpordescricaoproduto(@PathVariable String descricao_produto) {
        return repository.findBydescricao_produto(descricao_produto);
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
