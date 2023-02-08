package com.example.demo.Repository;

import com.example.demo.Model.TarefasModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TarefasRepository extends JpaRepository<TarefasModel, Integer> {
    public List<TarefasModel> findBystatus(String status);

    public List<TarefasModel> findByprioridade(String status);


}
