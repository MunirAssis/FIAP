package br.com.fiap.entities;

public class LeituraOcr {
    private String cnpjLido;
    private double valorLido;
    private double confianca;


    //metodo contrutor vazio

    public LeituraOcr() {
    }

    //metodo contrutor cheio

    public LeituraOcr(String cnpjLido, double valorLido, double confianca) {
        this.cnpjLido = cnpjLido;
        this.valorLido = valorLido;
        this.confianca = confianca;


    }

    //getters e setters

    public String getCnpjLido() {
        return cnpjLido;
    }

    public void setCnpjLido(String cnpjLido) {
        this.cnpjLido = cnpjLido;
    }

    public double getValorLido() {
        return valorLido;
    }

    public void setValorLido(double valorLido) {
        this.valorLido = valorLido;
    }

    public double getConfianca() {
        return confianca;
    }

    public void setConfianca(double confianca) {
        this.confianca = confianca;
    }

    //toStrinG

    @Override
    public String toString() {
        return "LeituraOcr" +
                "cnpjLido='" + cnpjLido + '\'' +
                ", valorLido=" + valorLido +
                ", confianca=" + confianca;
    }
}
