package com.example.demo.Repository;

import com.example.demo.Model.VendaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<VendaModel,Integer> {

}
