package com.example.demo.Repository;

import com.example.demo.Model.LivrosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LivrosRepository extends JpaRepository<LivrosModel, Integer> {

}
