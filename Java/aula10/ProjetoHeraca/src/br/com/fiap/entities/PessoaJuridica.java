package br.com.fiap.entities;

public class PessoaJuridica extends Pessoa {

    // visibilidade, tipo de dados e atributo
    private String cnpj;
    private String segmento;

    // metodo construtor com parametro vazio
    public PessoaJuridica() {
    }

    // metodo construtor com parametro cheio e herança
    public PessoaJuridica(String nome, String email, String fone, double renda, String cnpj, String segmento) {
        super(nome, email, fone, renda);
        this.cnpj = cnpj;
        this.segmento = segmento;
    }

    // metodos getters e setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    @Override
    public String toString() {
        return "\n\nPessoa Juridica" +
                "\nEmpresa = '" + nome + '\'' +
                "\nEmail = '" + email + '\'' +
                "\nFone = '" + fone + '\'' +
                "\nRenda = " + renda +
                "\nCNPJ = '" + cnpj + '\'' +
                "\nSegmento = '" + segmento + '\'';
    }
}
