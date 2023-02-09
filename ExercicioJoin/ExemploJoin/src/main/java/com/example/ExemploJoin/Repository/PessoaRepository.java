package com.example.ExemploJoin.Repository;

import com.example.ExemploJoin.Model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
}
