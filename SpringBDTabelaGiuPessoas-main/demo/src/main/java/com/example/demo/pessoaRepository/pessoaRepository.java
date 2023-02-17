package com.example.demo.pessoaRepository;

import com.example.demo.pessoaModel.pessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface pessoaRepository extends JpaRepository<pessoaModel,Integer> {
}
