package com.example.demo.Repository;

import com.example.demo.model.TarefasModel;

import java.util.ArrayList;
import java.util.List;

public class TarefasRepository {
    List<TarefasModel> tarefas = new ArrayList<>();

    public TarefasRepository() {
        tarefas.add(new TarefasModel(1, "Fazer café"));
        tarefas.add(new TarefasModel(2, "Tomar café"));
        tarefas.add(new TarefasModel(3, "IR ao banheiro"));
        tarefas.add(new TarefasModel(4, "Tomar mais café"));
        tarefas.add(new TarefasModel(5, "Tomar Água"));
    }


    public void addTarefas(TarefasModel tarefa) {
        tarefas.add(tarefa);
    }

    public List<TarefasModel> getTarefas() {
        return tarefas;
    }

    public void deleteTarefas(TarefasModel tarefa) {
        tarefas.remove(tarefa);
    }

    public void updateTarefas(TarefasModel tarefa) {
        for (TarefasModel c : tarefas) {
            if (c.getId() == tarefa.getId()) {
                c.setTarefas(tarefa.getTarefas());
            }
        }
    }

    public TarefasModel gettarefaByID(int id) {
        for (TarefasModel c : tarefas) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }


}
