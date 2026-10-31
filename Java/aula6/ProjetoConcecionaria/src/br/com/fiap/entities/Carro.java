package br.com.fiap.entities;

public class Carro {
    private int ano;
    private String placa;
    private String marca;
    private String modelo;
    private double valor;

    //metodos contrutor parametro vazio

    public Carro() {
    }

    //metodos contrutor com parametro cheio

    public Carro(int ano, String placa, String marca, String modelo, double valor) {
        this.ano = ano;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }


    //getters e setters

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    //toString

    @Override
    public String toString() {
        return "\n Carro" +
                "\n ano=" + ano +
                ",\n placa='" + placa + '\'' +
                ",\n marca='" + marca + '\'' +
                ",\n modelo='" + modelo + '\'' +
                ",\n valor=" + valor;
    }
}
