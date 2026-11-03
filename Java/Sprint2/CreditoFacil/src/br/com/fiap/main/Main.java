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
        return Double.parseDouble(JOptionPane.showInputDialog(j));    }

    //print
    static void mostrar(String j) {
        JOptionPane.showMessageDialog(null, j);
    }

    public static void main(String[] args) {
        //instanciando...
        //Endereço
        Endereco objEndereco = new Endereco(
                texto("Informações do Endereço \nLogradouro"),
                texto("Cidade "),
                texto("Estado (SP) "),
                texto("CEP "));
                mostrar("ENDEREÇO\n" + objEndereco);
        //Consentimento
        Consentimento objConsentimento =new Consentimento(
                true,
                texto("Consentimento \nData da aprovação "),
                texto("finalidade"));
                mostrar("CONSENTIMENTO\n" + objConsentimento);
        //Doador | Herda Pessoa
        Doador objDoador = new Doador(
                inteiro("DADOS DO DOADOR \nID "),
                texto("Nome "),
                texto("e-mail "),
                texto("Telefone "),
                texto("CPF "),
                objEndereco,
                objConsentimento);
                mostrar("DOADOR\n" + objDoador);
        //Instituição | Herda Pessoa
        Instituicao objInstituicao = new Instituicao(
                inteiro("DADOS DA INSTITUIÇÃO \nID"),
                texto("Nome "),
                texto("e-mail "),
                texto("Telefone "),
                texto("CNPJ "),
                texto("Causa "));
                mostrar("INSTITUIÇÃO\n" + objInstituicao);
        //LeituraOCR
        LeituraOcr objLeitura = new LeituraOcr(
                texto("OCR \nCNPJ lido"),
                real("Valor lido "),
                real("Confiança (0 a 1) "));
                mostrar("LEITURA OCR\n" + objLeitura);
        //Nota Fiscal
        NotaFiscal objNota = new NotaFiscal(
                inteiro("DADOS DA NOTA \nID "),
                texto("CNPJ do emissor "),
                real("Valor "),
                texto("Data de emissão"),
                texto("Estatus "),
                objDoador,
                objLeitura);
        //VinculoNFP
        VinculoNfp objVinculo = new VinculoNfp(
                inteiro("DADOS DO VINCULO \nID"),
                texto("Data"),
                texto("Estatus "),
                objDoador,
                objInstituicao);
        //Doacao
        Doacao objDoacao = new Doacao(
                inteiro("DADOS DA DOAÇÃO \nID"),
                real("Valor da doação "),
                texto("Data "),
                objNota,
                objVinculo
        );

        //Duvida Chatbot
        DuvidaChatbot objDuvida = new DuvidaChatbot(
                inteiro("Duvida \nID "),
                texto("Pergunta "),
                texto("Resposta do BOT "),
                objDoador
        );
                mostrar("CHATBOT" + objDuvida);
        //Painel
        PainelDoador objPainel = new PainelDoador(
                objDoador,
                objDoacao
        );
                mostrar(objPainel.gerarResumo());
        //Pessoa | Classe abstrata
        Pessoa objPessoa = objDoador;
                mostrar("PESSOA \nNome " + objPessoa.getNome() + "\n" + objPessoa);

        //teste de setters
        objDoador.setTelefone(texto("Novo telefone do doador "));
        objEndereco.setCidade(texto("Nova cidade "));
                mostrar("SETTERS \nTelefone " + objDoador.getTelefone() +
                        "\nCidade " + objEndereco.getCidade());
    }


}
