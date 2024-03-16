package model;

import view.Contato;
import view.AgendaTelefonica;

public class Principal {
    public static void main(String[] args) {
        
        AgendaTelefonica agenda = new AgendaTelefonica();

        agenda.adicionarContato("João", "123456789", "joao@email.com");
        agenda.adicionarContato("Maria", "987654321", "maria@email.com");

        agenda.removerContato("João");

        Contato contatoMaria = agenda.buscarContato("Maria");
        if (contatoMaria != null) {
            System.out.println("Contato encontrado:");
            System.out.println("Nome: " + contatoMaria.getNome());
            System.out.println("Telefone: " + contatoMaria.getTelefone());
            System.out.println("E-mail: " + contatoMaria.getEmail());
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}

