package com.example.demo.Repository;

import com.example.demo.Model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<ProdutoModel, Integer> {
}
