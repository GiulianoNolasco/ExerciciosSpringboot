package com.example.demo.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "A_GIU_VENDAS")
public class VendaModel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY,generator= "giu_VEN")
    @SequenceGenerator(name="SEQ_A_GIU_VENDAS", sequenceName="SEQ_A_GIU_VENDAS")
    @Column(name = "ID_VENDA")
    private int idVenda;

    @Column(name = "DATA_VENDA")
    private Date dataVenda;
    @ManyToOne
    @JoinColumn(name = "ID_PRODUTO",referencedColumnName = "ID_PRODUTO")
    private ProdutoModel idProduto;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE",referencedColumnName = "ID_CLIENTE")
    private ClienteModel idCliente;

}
