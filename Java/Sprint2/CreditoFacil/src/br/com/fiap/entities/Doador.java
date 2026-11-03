package br.com.fiap.entities;

public class Doador extends Pessoa{
    private String cpf;
    private Endereco endereco;
    private Consentimento consentimento;

    //metodo construtor vazio
    public Doador() {
    }

    //metodo construtor cheio
    public Doador(int id, String nome, String email, String telefone, String cpf, Endereco endereco, Consentimento consentimento) {
        super(id, nome, email, telefone);
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
        return "Doador " +
                "\ncpf= '" + cpf + '\'' +
                ", \nendereco = " + endereco +
                ", \nconsentimento = " + consentimento +
                ", \nid = " + id +
                ", \nnome = '" + nome + '\'' +
                ", \nemail = '" + email + '\'' +
                ", \ntelefone = '" + telefone ;
    }
}
