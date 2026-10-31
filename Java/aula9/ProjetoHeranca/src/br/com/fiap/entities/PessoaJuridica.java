package br.com.fiap.entities;

public class PessoaJuridica extends Pessoa{

    private String cnpj;
    private String segmento;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, String email, String fone, double renda, String cnpj, String segmento) {
        super(nome, email, fone, renda);
        this.cnpj = cnpj;
        this.segmento = segmento;
    }

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
        return "\nPessoaJuridica" +
                "\ncnpj='" + cnpj + '\'' +
                "\nsegmento='" + segmento + '\'' +
                "\nnome='" + nome + '\'' +
                "\nemail='" + email + '\'' +
                "\nfone='" + fone + '\'' +
                "\nrenda=" + renda;
    }
}
