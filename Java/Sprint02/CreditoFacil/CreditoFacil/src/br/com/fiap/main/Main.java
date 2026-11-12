package br.com.fiap.main;
import br.com.fiap.entities.*;
import javax.swing.*;

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
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    //print
    static void mostrar(String j) {
        JOptionPane.showMessageDialog(null, j);
    }

    public static void main(String[] args) {
        mostrar("Bem-vindo(a) ao CréditoFácil!\nAqui você doa suas notas fiscais para a Turma do Bem\ne acompanha o crédito gerado pela sua doação.");

        //Instituição parceira (dados fixos/fictícios, já que o sistema atende só a Turma do Bem)
        Instituicao turmaDoBem = new Instituicao(
                1,
                "Turma do Bem",
                "contato@turmadobem.org.br",
                "1140028922",
                "12345678000199",
                "Apoio a crianças de baixa renda, oferecendo tratamento odontológico");

        //Endereço do doador
        Endereco objEndereco = new Endereco(
                texto("Vamos cadastrar sua doação.\nQual é o seu logradouro (rua/avenida)?"),
                texto("Em qual cidade você mora?"),
                texto("Qual é o seu estado? (sigla, ex: SP)"),
                texto("Qual é o seu CEP? (somente números, ex: 01310100)"));

        //Consentimento LGPD | começa NÃO aceito, finalidade já é a do sistema
        Consentimento objConsentimento = new Consentimento(
                false, "", "Doação de notas fiscais para a Turma do Bem");

        //Doador | Herda Pessoa
        Doador objDoador = new Doador(
                1,
                texto("Qual é o seu nome completo?"),
                texto("Qual é o seu e-mail?"),
                texto("Qual é o seu telefone? (com DDD, ex: 11999999999)"),
                texto("Qual é o seu CPF? (somente números)"),
                objEndereco,
                objConsentimento);
        mostrar("Cadastro realizado com sucesso!\n\n" + objDoador);

        //Aceite do consentimento, liberando o uso dos dados para a doação
        objConsentimento.registrarAceite(texto("Para continuar, confirme a data em que você aceita o uso dos seus dados (LGPD).\n(formato: dd/mm/aaaa)"));
        mostrar("Consentimento confirmado!\n\n" + objConsentimento);

        //LeituraOCR | simula a leitura automática da nota fiscal enviada
        LeituraOcr objLeitura = new LeituraOcr(
                texto("Agora vamos ler sua nota fiscal.\nQual é o CNPJ identificado nela? (somente números)"),
                real("Qual é o valor identificado? (use ponto para decimais, ex: 150.50)"),
                real("Qual é a confiança da leitura? (um valor entre 0 e 1, ex: 0.95)"));
        mostrar("Leitura concluída!\n\n" + objLeitura);

        //Nota Fiscal | status começa "Pendente" e o metodo decide se é válida
        NotaFiscal objNota = new NotaFiscal(
                1,
                texto("Qual é o CNPJ do emissor da nota?"),
                real("Qual é o valor da nota? (use ponto para decimais, ex: 150.50)"),
                texto("Qual é a data de emissão? (formato: dd/mm/aaaa)"),
                "Pendente",
                objDoador,
                objLeitura);
        boolean elegivel = objNota.verificarElegibilidade();
        mostrar("Nota fiscal analisada!\n"
                + "\nValor: R$ " + objNota.getValor()
                + "\nElegível para doação? " + (elegivel ? "Sim" : "Não")
                + "\nStatus: " + objNota.getStatus());

        //VinculoNFP | liga o doador à Turma do Bem (já com consentimento aceito)
        VinculoNfp objVinculo = new VinculoNfp(
                1,
                texto("Quase lá! Qual é a data de hoje, para registrar seu vínculo com a Turma do Bem?\n(formato: dd/mm/aaaa)"),
                "Pendente",
                objDoador,
                turmaDoBem);
        objVinculo.ativar();
        mostrar("Vínculo criado com a Turma do Bem!\n\n" + objVinculo);

        //Doacao
        Doacao objDoacao = new Doacao(
                1,
                real("Qual é o valor da sua doação? (use ponto para decimais, ex: 150.50)"),
                texto("Qual é a data da doação? (formato: dd/mm/aaaa)"),
                objNota,
                objVinculo);
        double credito = objDoacao.calcularCredito();
        mostrar("Doação registrada com sucesso!\n"
                + "\nValor doado: R$ " + objDoacao.getValor()
                + "\nCrédito estimado: R$ " + credito);

        //Duvida Chatbot | o doador pergunta, o assistente virtual responde
        DuvidaChatbot objDuvida = new DuvidaChatbot(
                1,
                texto("Ficou alguma dúvida? Pergunte para o nosso assistente virtual."),
                "Obrigado por sua pergunta! Nossa equipe vai te responder em breve. ",
                objDoador);
        mostrar("Chatbot\n\nPergunta: " + objDuvida.getPergunta()
                + "\n\nResposta: " + objDuvida.getResposta());

        //Painel | resumo final da participação do doador
        PainelDoador objPainel = new PainelDoador(objDoador, objDoacao);
        mostrar(objPainel.gerarResumo());

        mostrar("Cadastro finalizado! Obrigado por doar para a Turma do Bem.");
    }
}
