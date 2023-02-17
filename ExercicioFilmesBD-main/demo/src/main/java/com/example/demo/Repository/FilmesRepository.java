package com.example.demo.Repository;

import com.example.demo.Model.FilmesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmesRepository extends JpaRepository<FilmesModel, Integer> {

        @Query(value = "SELECT * FROM EXERCICIO_FILME WHERE DATA_LANCAMENTO LIKE '%2023%'", nativeQuery = true)
        public List<FilmesModel> buscarfilmesdoano2023();


    @Query(value = "SELECT * FROM EXERCICIO_FILME WHERE UPPER(TRIM(PAIS_ORIGEM)) = ?1", nativeQuery = true)
    public List<FilmesModel> pesquisaPorPAIS_ORIGEM(String PAIS_ORIGEM);

    @Query(value = "SELECT * FROM EXERCICIO_FILME WHERE DATA_LANCAMENTO = ?1", nativeQuery = true)
    public List<FilmesModel> pesquisaPorDATA_LANCAMENTO(int DATA_LANCAMENTO);


    @Query(value = "SELECT * FROM EXERCICIO_FILME ORDER BY quantidade_vendas", nativeQuery = true)
    public List<FilmesModel> pesquisarPorQtVendas();

    @Query(value = "SELECT * FROM GIU_USUARIO WHERE(TRUNC((SYSDATE-DATA_NASCIMENTO)/365)>18", nativeQuery = true)
    public List<FilmesModel> pesquisarMaiorDeIdade();

}
