package com.example.demo.Repository;

import com.example.demo.Model.usuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


public interface usuarioRepository extends JpaRepository<usuarioModel, Integer> {

    public usuarioModel findByCPF(String CPF);

    public List<usuarioModel> findByNOME(String NOME);

    @Query(value = "SELECT * FROM BCK_LUCAS WHERE upper(NOME) LIKE '%JAVA%'", nativeQuery = true)
    public List<usuarioModel> encontrapessoajava();

    @Query(value = "SELECT * FROM BCK_LUCAS WHERE NOME = ?1 AND SEXO = ?2 AND TIPO_SANGUINEO = ?3", nativeQuery = true)
    public List<usuarioModel> pesquisaPorCaracteristicas(String NOME, String SEXO, String TIPO_SANGUINEO);

    @Query(value = "SELECT * FROM BCK_LUCAS WHERE(TRUNC((SYSDATE-DATA_NASCIMENTO)/365)>18)", nativeQuery = true)
    public List<usuarioModel> pesquisarMaiorDeIdade();


}
