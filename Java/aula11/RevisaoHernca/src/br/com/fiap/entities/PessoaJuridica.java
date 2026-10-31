package br.com.fiap.entities;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String segmento;

    //metodo contrutor vazio (sempre o nome da classe)
    public PessoaJuridica() {
    }

    //metodo construtor cheio
    public PessoaJuridica(String nome, String email, String fone, double renda, String cnpj, String segmento) {
        super(nome, email, fone, renda);
        this.cnpj = cnpj;
        this.segmento = segmento;
    }

    //getters e setters

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

    //toString

    @Override
    public String toString() {
        return tipoPessoa() +
                "\ncnpj='" + cnpj + '\'' +
                ", \nsegmento='" + segmento + '\'' +
                ", \nnome='" + nome + '\'' +
                ", \nemail='" + email + '\'' +
                ", \nfone='" + fone + '\'' +
                ", \nrenda=" + renda;
    }

    @Override
    public String tipoPessoa() {
        return "\n\nPessoa Juridica";
    }
}
