package br.com.fiap.entities;

public class Doador {
    private String cpf;
    private Endereco endereco;
    private Consentimento consentimento;

    //metodo contrutor vazio
    public Doador() {
    }

    //metodo contrutor cheio
    public Doador(String cpf, Endereco endereco, Consentimento consentimento) {
        this.cpf = cpf;
        this.endereco = endereco;
        this.consentimento = consentimento;
    }

    //getters e setters

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Consentimento getConsentimento() {
        return consentimento;
    }

    public void setConsentimento(Consentimento consentimento) {
        this.consentimento = consentimento;
    }

    //toString

    @Override
    public String toString() {
        return "Doador" +
                "cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                ", consentimento=" + consentimento;
    }
}
