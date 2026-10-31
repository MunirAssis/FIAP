package br.com.fiap.main;


import br.com.fiap.entities.DadosBancarios;
import br.com.fiap.entities.PessoaFisica;
import br.com.fiap.entities.PessoaJuridica;

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

    //doblle
    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    static void main(String[] args) {

        //instanciar Objeto
        //String nome, String email, String fone, doble renda, string cpf, string rg
        PessoaFisica objPessoaFisica = new PessoaFisica(
                texto( "Informações da Pessoa Fisica\n Nome:"),
                texto( "Email"),
                texto( "Fone"),
                real( "Real"),
                texto( "CPF"),
                texto( "rg")
        );

        PessoaJuridica objPessoaJuridica = new PessoaJuridica(
                texto( "Informações da Pessoa Fisica\n Nome:"),
                texto( "Email"),
                texto( "Fone"),
                real( "Pro-labore"),
                texto( "Cnpj"),
                texto( "Segmento")
        );

        DadosBancarios objDadosBancarios = new DadosBancarios(
                texto( "Informações dos Dados Bancarios\n Banco"),
                texto( "Agência"),
                inteiro( "Numero da Conta"),
                texto( "tipo da conta")
        );

        objPessoaFisica.setDadosBancarios(objDadosBancarios);

        //saidas
        System.out.println(objPessoaFisica + "" + objPessoaJuridica);

    }
}
