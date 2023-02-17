package com.example.demo.Repository;

import com.example.demo.Model.ClienteModel;
import com.example.demo.Model.FuncionarioModel;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository {
    List<FuncionarioModel> funcionarios = new ArrayList<>();

    public FuncionarioRepository() {
        funcionarios.add(new FuncionarioModel(1, "Joao", 30, 27));
        funcionarios.add(new FuncionarioModel(2, "Pedro", 50, 20));
        funcionarios.add(new FuncionarioModel(3, "Maria", 15, 14));
        funcionarios.add(new FuncionarioModel(4, "Paulo", 87, 75));
        funcionarios.add(new FuncionarioModel(5, "Cesar", 8, 80));
    }

    public void addFuncionario(FuncionarioModel funcionario) {
        funcionarios.add(funcionario);
    }

    public List<FuncionarioModel> getFuncionario() {
        return funcionarios;
    }

    public void deleteFuncionario(FuncionarioModel funcionario) {
        funcionarios.remove(funcionario);
    }

    public void updateFuncionario(FuncionarioModel funcionario) {
        for (FuncionarioModel f : funcionarios) {
            if (f.getId() == funcionario.getId()) {
                f.setNome(funcionario.getNome());
                f.setIdade(funcionario.getIdade());
                f.setCodigoCadastro(funcionario.getCodigoCadastro());


            }
        }
    }

    public FuncionarioModel getFuncionarioByID(int id) {
        for (FuncionarioModel f : funcionarios) {
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }
}
