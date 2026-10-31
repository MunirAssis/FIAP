package br.com.fiap.entities;

public class Concessionaria {

    private int numeroUnidade;
    private String cnpj;
    private String nomeFantasia;
    private Carro carro; //atributo de referencia

    //metodo contrutor com parametro vazio

    public Concessionaria() {
    }

    //metodo contrutor com parametro cheio, sem atributo de referencia

    public Concessionaria(int numeroUnidade, String cnpj, String nomeFantasia) {
        this.numeroUnidade = numeroUnidade;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    // getter e setters

    public int getNumeroUnidade() {
        return numeroUnidade;
    }

    public void setNumeroUnidade(int numeroUnidade) {
        this.numeroUnidade = numeroUnidade;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    //toString (serve para imprimir as saidas)

    @Override
    public String toString() {
        return "\n Concessionaria" +
                "\n numeroUnidade=" + numeroUnidade +
                "., \n cnpj='" + cnpj + '\'' +
                ",\n nomeFantasia='" + nomeFantasia + '\'' +
                ",\n carro=" + carro;
    }
}
