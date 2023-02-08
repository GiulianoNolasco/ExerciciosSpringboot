package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "LIVROS")
public class LivrosModel {

    @Id
    @Column(name = "ID")
    private int ID;

    @Column(name = "TITULO")
    private String TITULO;

    @Column(name = "AUTOR")
    private String AUTOR;

    @Column(name = "ANO_PUBLICACAOO")
    private int ANO_PUBLICACAOO;
    @Column(name = "GENERO")
    private String GENERO;

}
