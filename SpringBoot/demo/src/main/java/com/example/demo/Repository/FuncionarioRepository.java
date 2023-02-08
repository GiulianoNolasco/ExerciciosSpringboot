package com.example.demo.Repository;

import com.example.demo.model.FuncionarioModel;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository {
    List<FuncionarioModel> funcionarios = new ArrayList<>();

    public FuncionarioRepository() {
        funcionarios.add(new FuncionarioModel(1, "teste", "014.587.875-99"));
        funcionarios.add(new FuncionarioModel(2, "dois", "014.587.875-99"));
        funcionarios.add(new FuncionarioModel(3, "tres", "014.587.875-99"));
        funcionarios.add(new FuncionarioModel(4, "quatro", "014.587.875-99"));
        funcionarios.add(new FuncionarioModel(5, "cinco", "014.587.875-99"));
    }


    public void addfuncionario(FuncionarioModel funcionario) {
        funcionarios.add(funcionario);
    }

    public List<FuncionarioModel> getfuncionario() {
        return funcionarios;
    }

    public void deletefuncionario(FuncionarioModel funcionario) {
        funcionarios.remove(funcionario);
    }

    public void updatefuncionario(FuncionarioModel funcionario) {
        for (FuncionarioModel c : funcionarios) {
            if (c.getId() == funcionario.getId()) {
                c.setNome(funcionario.getNome());
                c.setCPF(funcionario.getCPF());
            }
        }
    }

    public FuncionarioModel getfuncionarioByID(int id) {
        for (FuncionarioModel c : funcionarios) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }


}
