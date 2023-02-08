package com.example.demo.Repository;

import com.example.demo.model.ClienteModel;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    List<ClienteModel> clientes = new ArrayList<>();

    public ClienteRepository() {
        clientes.add(new ClienteModel(1,"teste","000.555.444.98"));
        clientes.add(new ClienteModel(2,"dois","000.555.444.98"));
        clientes.add(new ClienteModel(3,"tres","000.555.444.98"));
        clientes.add(new ClienteModel(4,"quatro","000.555.444.98"));
        clientes.add(new ClienteModel(5,"cinco","000.555.444.98"));
    }


    public void addCliente(ClienteModel cliente) {
        clientes.add(cliente);
    }

    public List<ClienteModel> getCliente() {
        return clientes;
    }

    public void deleteCliente(ClienteModel cliente) {
        clientes.remove(cliente);
    }

    public void updateCliente(ClienteModel cliente) {
        for (ClienteModel c : clientes) {
            if (c.getId() == cliente.getId()) {
                c.setNome(cliente.getNome());
                c.setCPF(cliente.getCPF());
            }
        }
    }

    public ClienteModel getclienteByID(int id) {
        for (ClienteModel c : clientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }


}
