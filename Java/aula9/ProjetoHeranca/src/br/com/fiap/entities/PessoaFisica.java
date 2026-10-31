package br.com.fiap.entities;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private String rg;

    //contrutor
    public PessoaFisica() {
    }

    //metodo cheio


    public PessoaFisica(String nome, String email, String fone, double renda, String cpf, String rg) {
        super(nome, email, fone, renda);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\nPessoaFisica" +
                "\nrg='" + rg + '\'' +
                "\ncpf='" + cpf + '\'' +
                "\nnome='" + nome + '\'' +
                "\nemail='" + email + '\'' +
                "\nfone='" + fone + '\'' +
                "\nrenda=" + renda;
    }
}
