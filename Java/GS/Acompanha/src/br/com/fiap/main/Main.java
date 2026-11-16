package br.com.fiap.main;
import br.com.fiap.entities.*;
import javax.swing.*;

public class Main {
    //setando os "tipos"
    //String
    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    //int
    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    //doble
    static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    //print
    static void mostrar(String j) {
        JOptionPane.showMessageDialog(null, j);
    }

    //mensagem inicial
    public static void main (String[] args) {
        mostrar("bem-vindo(a) ao Acompanha!\n Aqui nos cuidamos do seu idoso para você, lembrando os horarios dele. Caso ele não responda, você sera notificado");


        //cadastro Responsavel | Herda Pessoa
        Familiar objFamiliar = new Familiar(
                1,
                texto("Vamos fazer o Cadastro do responsavel\nNome do responsavel"),
                texto("Telefone"),
                texto("Parentesco"),
                texto("Email")
        );
        mostrar("O seu cadastro foi realizado com sucesso!\n\n" + objFamiliar);


        //cadastro idoso | Herda Pessoa
        Idoso objIdoso = new Idoso(
                1,
                texto("Vamos fazer o cadastro do seu Idoso.\n Qual o nome do seu Idoso?"),
                texto("qual o telefone do seu idoso?"),
                texto("Qual a data de Nascimento do seu Idoso?"),
                objFamiliar
        );
        mostrar("Cadastro do Idoso realizado com sucesso!\n\n" + objIdoso);


        //medicamento
        Medicamento objMedicamento = new Medicamento(
                1,
                texto("Vamos cadastrar o medicamento\nNome do medicamento"),
                texto("dosagem do medicamento"),
                texto("horario do medicamento"),
                objIdoso
        );
        mostrar("Medicamento cadastrado!\n\n" + objMedicamento);


        //consulta
        Consulta objConsulta = new Consulta(
                1,
                texto("Vamos cadastrar as consultas do seu idoso\nespecialidade"),
                texto("Qual o nome do medico"),
                texto("Qual a data e a hora da consuta (formato: dd/mm/aaaa 14:30)"),
                objIdoso
        );
        mostrar("Consulta cadastrada!\n\n" + objConsulta);


        //lembrete do medicamento | gerado pelo o medicamento
        Lembrete objLembrete = objMedicamento.gerarLembrete();
        mostrar("lembrete gerado!\n\n" + objLembrete);

        //1ª tentativa de lembrar o idoso
        mostrar(objLembrete.enviar());
        String respondeu = texto("O idoso respondeu o Lembrete? (S/N)");
        if (respondeu.equalsIgnoreCase("S")){
            objLembrete.confirmar();
        }
        //2ª tentativa | so acontece se status ainda estiver pendente
        if (objLembrete.getStatus().equals("PENDENTE")){
            mostrar(objLembrete.enviar());
            respondeu = texto("O Idoso respondeu o lembrete? (S/N)");
            if (respondeu.equalsIgnoreCase("S")){
                objLembrete.confirmar();
            }
        }


        //alerta | sem resposta? = avisar a familia
        if (objLembrete.semResposta()) {
            Alerta objAlerta = new Alerta(
                    1,
                    "Lembrete sem resposta",
                    texto("O idoso não respondeu ao lembrete!\nQual a data e hora do alerta? (formato: dd/mm/aaaa 08:10)"),
                    false,
                    objLembrete,
                    objFamiliar
            );
            mostrar(objAlerta.enviarAlerta());
            mostrar("Alerta registrado!\n\n" + objAlerta);
        } else {
            mostrar("O idoso confirmou lembrete. Nenhum alerta necessario.");
        }


        //lembrete de consulta | gerado pela Consulta
        Lembrete objLembreteConsulta = objConsulta.gerarLembrete();
        mostrar(objLembreteConsulta.enviar());
        objLembreteConsulta.confirmar();
        mostrar("Lembrete de consulta confirmado!\n\n" + objLembreteConsulta);

        //Resumo final | estados dos obj apos a operação
        mostrar("Resumo do lembrete dos Medicamentos:\n\n" + objLembrete);

        mostrar("Cadastro finalizado! Obrigado por usar o Acompanha");
    }
}
