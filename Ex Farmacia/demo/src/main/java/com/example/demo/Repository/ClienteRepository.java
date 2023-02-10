package com.example.demo.Repository;

import com.example.demo.Model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {

    @Query(value = "UPDATE B_CLIENTES_GIUFARMACIA SET ativo = '2' WHERE IDCLIENTE = ?1", nativeQuery = true)
    public ClienteModel atualizaAtivo(int id);


}
