package com.example.demo.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "A_GIU_PRODUTOS")
public class ProdutoModel {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY,generator= "giu_pro")
    @SequenceGenerator(name="SEQ_A_GIU_PRODUTOS", sequenceName="SEQ_A_GIU_PRODUTOS")
    @Column(name = "ID_PRODUTO")
    private int idCliente;
    @Size(min = 2, max = 100, message = "Tamanho fora do padrao.")
    @Column(name = "nome")
    private String nome;
    @NotBlank
    @Column(name = "PRECO")
    private String preco;
    @ManyToOne
    @JoinColumn(name = "ID_FORNECEDOR",referencedColumnName = "ID_FORNECEDOR")
    private FornecedorModel IdFornecedor;


}
