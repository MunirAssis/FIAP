package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;

public class TesteColaborador {

    // metodo de execução  -> 25  public psvma  //  21  psvm
    public static void main(String[] args) {

        // Instanciar objeto
        Colaborador objColaborador = new Colaborador();

        // Entradas
        objColaborador.setNumeroRegistro(2222);
        objColaborador.setNome("Caroline");
        objColaborador.setCargo("T.I");
        objColaborador.setSalario(15545.45);

        //Saídas
        System.out.println(objColaborador.getNumeroRegistro());
        System.out.println(objColaborador.getNome());
        System.out.println(objColaborador.getCargo());
        System.out.println(objColaborador.getSalario());
    }
}
