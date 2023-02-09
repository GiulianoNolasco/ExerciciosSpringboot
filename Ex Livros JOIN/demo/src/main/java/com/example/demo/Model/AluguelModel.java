package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "ALUGUEL_GIU")
public class AluguelModel {

    @Id
    @Column(name = "ID")
    private int id;
    @ManyToOne
    @JoinColumn(name = "ID_LIVRO", referencedColumnName = "ID")
    private LivroModel idLivro;
    @Column(name = "DATA_ALUGUEL")
    private Date aluguel;

}
