package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;

@Data
@Entity
@Table(name = "PONTO_GIU")
public class PontoModel {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "DATA_ENTRADA")
    private Date dataEntrada;
    @Column(name = "DATA_SAIDA")
    private Date DataSaida;
    @ManyToOne
    @JoinColumn(name = "FK_PESSOA", referencedColumnName = "id")
    private PessoaModel fkPessoa;

}
