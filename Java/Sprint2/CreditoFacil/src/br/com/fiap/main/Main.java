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
        //instanciando...
        //Endereço
        Endereco objEndereco = new Endereco(
                texto("Informações do Endereço \nLogradouro"),
                texto("Cidade "),
                texto("Estado (SP) "),
                texto("CEP "));
                mostrar("ENDEREÇO\n" + objEndereco);
        //Consentimento | começa NÃO aceito
        Consentimento objConsentimento = new Consentimento(
                false,
                "",
                texto("Consentimento \nFinalidade "));
                mostrar("CONSENTIMENTO (antes do aceite)\n" + objConsentimento);
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
                inteiro("DADOS DA INSTITUIÇÃO \nID "),
                texto("Nome "),
                texto("e-mail "),
                texto("Telefone "),
                texto("CNPJ "),
                texto("Causa "));
                mostrar("INSTITUIÇÃO\n" + objInstituicao);
        //LeituraOCR
        LeituraOcr objLeitura = new LeituraOcr(
                texto("OCR \nCNPJ lido "),
                real("Valor lido "),
                real("Confiança (0 a 1) "));
                mostrar("LEITURA OCR\n" + objLeitura);
        //Nota Fiscal | status começa "Pendente" e o metodo decide
        NotaFiscal objNota = new NotaFiscal(
                inteiro("DADOS DA NOTA \nID "),
                texto("CNPJ do emissor "),
                real("Valor "),
                texto("Data de emissão "),
                "Pendente",
                objDoador,
                objLeitura);
        String statusAntes = objNota.getStatus();
        boolean elegivel = objNota.verificarElegibilidade();
        mostrar("NOTA FISCAL (válida)\nID: " + objNota.getId()
                + "\nEmissor: " + objNota.getCnpjEmissor()
                + "\nValor: R$ " + objNota.getValor()
                + "\nStatus antes: " + statusAntes
                + "\nElegível? " + elegivel
                + "\nStatus depois: " + objNota.getStatus());

        //Nota Fiscal inválida (valores fixos para testar o outro caminho do metodo)
        NotaFiscal objNotaInvalida = new NotaFiscal(
                99, null, 0.0, "00/00/0000", "Pendente", objDoador, objLeitura);
        boolean elegivel2 = objNotaInvalida.verificarElegibilidade();
        mostrar("NOTA FISCAL (inválida)\nElegível? " + elegivel2
                + "\nStatus: " + objNotaInvalida.getStatus());
        //VinculoNFP | primeiro sem consentimento, depois com
        VinculoNfp objVinculo = new VinculoNfp(
                inteiro("DADOS DO VÍNCULO \nID "),
                texto("Data do vínculo "),
                "Pendente",
                objDoador,
                objInstituicao);
        boolean tentativa1 = objVinculo.ativar();
        mostrar("VÍNCULO - tentativa 1 (sem consentimento)\nAtivou? " + tentativa1
                + "\nStatus: " + objVinculo.getStatus());

        objConsentimento.registrarAceite(texto("O doador aceitou. \nData da aprovação "));
        mostrar("CONSENTIMENTO (depois do aceite)\n" + objConsentimento);

        boolean tentativa2 = objVinculo.ativar();
        mostrar("VÍNCULO - tentativa 2 (com consentimento)\nAtivou? " + tentativa2
                + "\nStatus: " + objVinculo.getStatus()
                + "\nDoador: " + objVinculo.getDoador().getNome()
                + "\nInstituição: " + objVinculo.getInstituicao().getNome());

        //Doacao
        Doacao objDoacao = new Doacao(
                inteiro("DADOS DA DOAÇÃO \nID "),
                real("Valor da doação "),
                texto("Data "),
                objNota,
                objVinculo);
        double credito = objDoacao.calcularCredito();
        mostrar("DOAÇÃO (nota válida)\nValor: R$ " + objDoacao.getValor()
                + "\nData: " + objDoacao.getData()
                + "\nCrédito estimado: R$ " + credito);

        Doacao objDoacaoInvalida = new Doacao(
                98, objDoacao.getValor(), objDoacao.getData(), objNotaInvalida, objVinculo);

        double credito2 = objDoacaoInvalida.calcularCredito();
        mostrar("DOAÇÃO (nota inválida)\nValor: R$ " + objDoacaoInvalida.getValor()
                + "\nCrédito estimado: R$ " + credito2);
        //Duvida Chatbot
        DuvidaChatbot objDuvida = new DuvidaChatbot(
                inteiro("DÚVIDA \nID "),
                texto("Pergunta "),
                texto("Resposta do BOT "),
                objDoador);
                mostrar("CHATBOT\nPergunta: " + objDuvida.getPergunta()
                + "\nResposta: " + objDuvida.getResposta()
                + "\nFeita por: " + objDuvida.getDoador().getNome());
        //Painel
        PainelDoador objPainel = new PainelDoador(objDoador, objDoacao);
        mostrar(objPainel.gerarResumo());

        //Pessoa | Classe abstrata
        Pessoa objPessoa = objDoador;
        mostrar("PESSOA \nNome: " + objPessoa.getNome() + "\n" + objPessoa);

        //teste de setters
        objDoador.setTelefone(texto("Novo telefone do doador "));
        objEndereco.setCidade(texto("Nova cidade "));
        mostrar("SETTERS \nTelefone: " + objDoador.getTelefone()
                + "\nCidade: " + objEndereco.getCidade());
    }
}
