package com.Acompanha.main;
import com.Acompanha.entities.*;

import javax.swing.*;
public class Main {

    //String
    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    //int
    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    //boolean

    //print
    static void mostrar(String j) {
        JOptionPane.showMessageDialog(null, j);
    }

    //mensagem inicial
    public static void main (String[] args) {
        mostrar("bem-vindo(a) ao Acompanha\n Aqui nos cuidamos do seu idoso para você, lembrando os horarios dele. Caso ele não responda, você sera notificado");
    }

    //cadastro Responsavel
    Familiar objFamiliar = new Familiar(
        1,
        texto("Vamos fazer o Cadastro do responsavel\nNome do responsavel"),
        texto("Telefone"),
        texto("Parentesco"),
        texto("email")
    );

    //cadastro idoso
    Idoso objIdoso = new Idoso(
            1,
        texto("Vamos fazer seu cadastro. Qual o nome do seu Idoso?"),
        texto("qual o telefone do seu idoso?"),
        texto("Qual a data de Nascimento do seu Idoso?"),
        objFamiliar
    );

    //medicamento
    Medicamento objMedicamento = new Medicamento(
            1,
            texto("Vamos cadastrar o medicamento\nNome do medicamento"),
            texto("dosagem do medicamento"),
            texto("horario do medicamento"),
            objIdoso
    );

    //consulta
    Consulta objConsulta = new Consulta(
            1,
            texto("Vamos cadastrar as consultas do seu idoso\nespecialidade"),
            texto("Qual o nome do medico"),
            texto("Qual a data e a hora da consuta"),
            objIdoso
    );

    //lembrete
    Lembrete objLembrete = new Lembrete(
            1,
            texto("Qual tipo de lembrete"),
            texto("Qual horario do lembrete "),
            texto("Qual o status dele"),
            inteiro("Quantas tentivas "),
            objIdoso
    );

    //alerta
    Alerta objAlerta =new Alerta(
            1,
            texto("Motivo do alerta"),
            texto("data e hora do alerta"),
            false,
            objLembrete,
            objFamiliar
    );
}
