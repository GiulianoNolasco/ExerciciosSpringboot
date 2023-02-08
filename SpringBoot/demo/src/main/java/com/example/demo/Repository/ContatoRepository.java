package com.example.demo.Repository;

import com.example.demo.model.ContatoModel;

import java.util.ArrayList;
import java.util.List;

public class ContatoRepository {

    List<ContatoModel> contatos = new ArrayList<>();

    public ContatoRepository() {
        contatos.add(new ContatoModel(1, "teste", 99875544));
        contatos.add(new ContatoModel(2, "teste", 99875544));
        contatos.add(new ContatoModel(13, "teste", 99875544));
        contatos.add(new ContatoModel(41, "teste", 99875544));
        contatos.add(new ContatoModel(61, "teste", 99875544));
    }


    public void addContato(ContatoModel contato) {
        contatos.add(contato);
    }

    public List<ContatoModel> getContato() {
        return contatos;
    }

    public void deleteContato(ContatoModel contato) {
        contatos.remove(contato);
    }

    public void updateContato(ContatoModel contato) {
        for (ContatoModel c : contatos) {
            if (c.getId() == contato.getId()) {
                c.setNome(contato.getNome());
                c.setTelefone(contato.getTelefone());
            }
        }
    }

    public ContatoModel getcontatoByID(int id) {
        for (ContatoModel c : contatos) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }


}
