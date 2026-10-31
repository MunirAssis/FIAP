package br.com.fiap.main;

import br.com.fiap.entities.Cliente;

public class TesteCliente {

    // metodo de execução  -> 25  public psvma  //  21  psvm
    public static void main(String[] args) {

        // Instanciar objeto
        Cliente objCliente = new Cliente();

        // Entradas
        objCliente.setNome("Braufagelio");
        objCliente.setCpf("888.888.888/88");
        objCliente.setIdade(85);
        objCliente.setAltura(1.75);

        //Saídas
        System.out.println(objCliente.getNome());
        System.out.println(objCliente.getCpf());
        System.out.println(objCliente.getIdade());
        System.out.println(objCliente.getAltura());
    }
}
