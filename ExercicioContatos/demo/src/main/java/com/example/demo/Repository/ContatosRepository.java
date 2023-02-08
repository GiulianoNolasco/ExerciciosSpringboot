package com.example.demo.Repository;

import com.example.demo.Model.ContatosModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContatosRepository extends JpaRepository<ContatosModel, Integer> {
    public List<ContatosModel> findBynome(String nome);


}
