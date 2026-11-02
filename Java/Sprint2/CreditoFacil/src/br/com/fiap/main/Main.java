package br.com.fiap.main;
import br.com.fiap.entities.*;

import javax.swin.*

public class Main {
//setando os "tipos"
    //string
    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    // int
    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // double
    static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));    }

    public static void main(String[] args) {
        //instanciando..
        PainelDoador objPainelDoador = new PainelDoador( );
    }

}
