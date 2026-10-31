package br.com.fiap.main;
import br.com.fiap.entities.*;

import javax.swing.*;
public class Main {

    //instanciando
    //String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    //int
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    //double
    static double real (String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    // BOOLEAN
    static boolean definirAtivo(String msg){
        String status = texto(msg);
        if(status.equalsIgnoreCase("S")){
            return true;
        }else if(status.equalsIgnoreCase("N")){
            return false;
        } else{
            JOptionPane.showMessageDialog(null,"Entrada inválida. Considerando Inativo");
            return false;
        }
    }

    static void main(String[] args){

    }
}
