package br.com.fiap.entities;

public class PainelDoador {
    private Doador doador;
    private Doacao ultimaDoacao;


    //metodo de construção vazio
    public PainelDoador() {
    }

    //metodo cheio
    public PainelDoador(Doador doador, Doacao ultimaDoacao) {
        this.doador = doador;
        this.ultimaDoacao = ultimaDoacao;
    }

    //metodo de funcinalidade | Mostrar ao doador o retorno da doação
    public String gerarResumo(){
        String resumo = "=====PAINEL DO DOADOR=====\n";
        resumo += "Doador: " + doador.getNome() + "\n";
        resumo += "E-mail: " + doador.getEmail() + "\n";
        resumo += "Valor da última doação R$ " + ultimaDoacao.getValor() + "\n";
        resumo += "Crédito estimado R$ " + ultimaDoacao.calcularCredito() + "\n";
        return resumo;
    } //a St gerarResumo recebe: nome, email, valor e credito do Doador+Doacao (para mostrar ao Doador)


    //getters e setters
    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public Doacao getUltimaDoacao() {
        return ultimaDoacao;
    }

    public void setUltimaDoacao(Doacao ultimaDoacao) {
        this.ultimaDoacao = ultimaDoacao;
    }

    //toString

    @Override
    public String toString() {
        return "PainelDoador" +
                "doador=" + doador +
                ", ultimaDoacao=" + ultimaDoacao;
    }
}
