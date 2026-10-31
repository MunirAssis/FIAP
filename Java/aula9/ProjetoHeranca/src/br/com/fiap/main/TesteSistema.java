package br.com.fiap.main;

import javax.swing.*;

public class TesteSistema{
//psvma
    static void main(String[] args) {
        static String texto(String j){
           return JOptionPane.showInputDialog(j);
        }

        static int inteiro(String j){
            return Integer(JOptionPane.showInputDialog(j));
        }

        static double real(String j){
            return Double((JOptionPane.showInputDialog(j)));
        }
    }
}
