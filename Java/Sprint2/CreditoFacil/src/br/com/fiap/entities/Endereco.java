package br.com.fiap.entities;

public class Endereco {
    private String logradouro;
    private String cidade;
    private String estado;
    private String cep;

    //metodo contruor vazio
    public Endereco() {
    }

    //metodo construtor cheio
    public Endereco(String logradouro, String cidade, String estado, String cep) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    //getters e setters

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    //toString

    @Override
    public String toString() {
        return "Endereco" +
                "logradouro='" + logradouro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep;
    }
}
