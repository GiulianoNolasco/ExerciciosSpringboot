package com.example.demo.Repository;

import com.example.demo.model.FornecedorModel;

import java.util.ArrayList;
import java.util.List;

public class FornecedorRepository {
    List<FornecedorModel> fornecedores = new ArrayList<>();

    public FornecedorRepository() {
        fornecedores.add(new FornecedorModel(1, "teste", "000.555.444/0001-11"));
        fornecedores.add(new FornecedorModel(2, "dois", "000.555.444/0001-11"));
        fornecedores.add(new FornecedorModel(3, "tres", "000.555.444/0001-11"));
        fornecedores.add(new FornecedorModel(4, "quatro", "000.555.444/0001-11"));
        fornecedores.add(new FornecedorModel(5, "cinco", "000.555.444/0001-11"));
    }


    public void addFornecedor(FornecedorModel Fornecedor) {
        fornecedores.add(Fornecedor);
    }

    public List<FornecedorModel> getFornecedor() {
        return fornecedores;
    }

    public void deleteFornecedor(FornecedorModel Fornecedor) {
        fornecedores.remove(Fornecedor);
    }

    public void updateFornecedor(FornecedorModel Fornecedor) {
        for (FornecedorModel c : fornecedores) {
            if (c.getId() == Fornecedor.getId()) {
                c.setNome(Fornecedor.getNome());
                c.setCNPJ(Fornecedor.getCNPJ());
            }
        }
    }

    public FornecedorModel getFornecedorByID(int id) {
        for (FornecedorModel c : fornecedores) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }


}
