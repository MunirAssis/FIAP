package br.com.fiap.entities;

public class PessoaFisica extends Pessoa{
    private String cpf;
    private String rg;
    private DadosBancarios dadosBancarios; //atributo de referencia //deve se adicionar o getter e setter

    //metodo contrutor vazio

    public PessoaFisica() {
    }

    //metodo contrutor cheio & Heranca
    public PessoaFisica(String nome, String email, String fone, double renda, String cpf, String rg) {
        super(nome, email, fone, renda);
        this.cpf = cpf;
        this.rg = rg;
    }

    //getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public DadosBancarios getDadosBancarios() {
        return dadosBancarios;
    }

    public void setDadosBancarios(DadosBancarios dadosBancarios) {
        this.dadosBancarios = dadosBancarios;
    }

    //toStrin

    @Override
    public String toString() {
        return tipoPessoa() +
                "\ncpf='" + cpf + '\'' +
                ", \nrg='" + rg + '\'' +
                ", \nnome='" + nome + '\'' +
                ", \nemail='" + email + '\'' +
                ", \nfone='" + fone + '\'' +
                ", \nRenda=" + renda + dadosBancarios;
    }

    @Override
    public String tipoPessoa() {
        return "\n\nPessoaFisica";
    }
}
