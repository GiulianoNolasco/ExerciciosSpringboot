package com.example.demo.Repository;

import com.example.demo.Model.AluguelModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AluguelRepository extends JpaRepository<AluguelModel, Integer> {
}
