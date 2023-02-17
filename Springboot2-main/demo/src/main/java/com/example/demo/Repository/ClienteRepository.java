package com.example.demo.Repository;
import com.example.demo.Model.ClienteModel;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    List<ClienteModel> clientes = new ArrayList<>();

    public ClienteRepository() {
        clientes.add(new ClienteModel(1, "Joao", 30, 27));
        clientes.add(new ClienteModel(2, "Pedro", 50, 20));
        clientes.add(new ClienteModel(3, "Maria", 15, 14));
        clientes.add(new ClienteModel(4, "Paulo", 87, 75));
        clientes.add(new ClienteModel(5, "Cesar", 8, 80));
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
                c.setIdade(cliente.getIdade());
                c.setCodigoCadastro(cliente.getCodigoCadastro());
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

