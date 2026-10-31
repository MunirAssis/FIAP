package br.com.fiap.main;

import br.com.fiap.entities.Cliente;

import java.sql.SQLOutput;

public class TesteCliente {

    public static void main(String[] args) {
        // instanciar objeto
        Cliente objClient = new Cliente();

        // Entradadas
        objClient.setNome("Munir");
        objClient.setCpf("222.222.222/22");
        objClient.setIdade(52);
        objClient.setAltura(1.70);

        //saidas
        System.out.println(objClient.getNome());
        System.out.println(objClient.getCpf());
        System.out.println(objClient.getIdade());
        System.out.println(objClient.getAltura());

    }

}
