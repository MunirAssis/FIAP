package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;

import javax.swing.*;

public class TesteSistema {

    //String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    //int
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    //doble
    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    //java
    public static void main(String[] args){

        //instanciar objetis

        //int numeroRegisto ...
        Colaborador objColaborador = new Colaborador(
                inteiro("INFORMAÇÔES DO COLABORADOR\n N de registro"),
                texto("nome"),
                texto("cargo"),
                real("quantidade de horas"),
                real("valor da hora trabalhada")
        );
    }
}
