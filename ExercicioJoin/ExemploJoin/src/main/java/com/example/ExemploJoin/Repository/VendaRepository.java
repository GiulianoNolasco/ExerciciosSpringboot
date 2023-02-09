package com.example.ExemploJoin.Repository;

import com.example.ExemploJoin.Model.VendaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<VendaModel, Long> {
}
