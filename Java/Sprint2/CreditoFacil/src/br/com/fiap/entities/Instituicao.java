package br.com.fiap.entities;

public class Instituicao extends Pessoa{
    private String cnpj;
    private String causa;

    //metodo construtor vazio
    public Instituicao() {
    }

    //metodo construtor cheio
    public Instituicao(int id, String nome, String email, String telefone, String cnpj, String causa) {
        super(id, nome, email, telefone);
        this.cnpj = cnpj;
        this.causa = causa;
    }



    //getters e setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    //toString
    @Override
    public String toString() {
        return "Instituição " +
                "\ncnpj='" + cnpj + '\'' +
                ", \ncausa='" + causa + '\'' +
                ", \nid=" + id +
                ", \nnome='" + nome + '\'' +
                ", \nemail='" + email + '\'' +
                ", \ntelefone='" + telefone;
    }
}
