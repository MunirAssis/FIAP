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
