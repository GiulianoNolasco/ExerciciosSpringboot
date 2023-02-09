package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "LIVRO_GIU")
public class LivroModel {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "AUTOR")
    private String autor;
    @Column(name = "ANO_PUBLICACAO")
    private int anoPublicacao;

}
