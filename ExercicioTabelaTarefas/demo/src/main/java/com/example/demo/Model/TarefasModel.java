package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Data
@Entity
@Table(name = "TAREFAS")
public class TarefasModel {

    @Id
    @Column(name = "id_tarefa")
    private int id_tarefa;

    @Column(name = "nome_tarefa")
    private String nometarefa;

    @Column(name = "descricao_tarefa")
    private String descricaotarefa;

    @Column(name = "data_inicio")
    private Date datainicio;

    @Column(name = "status")
    private String status;

    @Column(name = "prioridade")
    private int prioridade;

}
