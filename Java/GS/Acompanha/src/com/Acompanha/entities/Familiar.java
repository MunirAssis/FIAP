package com.Acompanha.entities;

public class Familiar extends Pessoa{
    private String parentesco;
    private String email;

    //metodo construtor vazio
    public Familiar() {
    }

    //metodo construtor cheio
    public Familiar(int id, String nome, String telefone, String parentesco, String email) {
        super(id, nome, telefone);
        this.parentesco = parentesco;
        this.email = email;
    }

    //getters e setters
    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //toString

    @Override
    public String toString() {
        return "Familiar" +
                "parentesco='" + parentesco + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone;
    }
}
