package br.com.fiap.entities;

public class DadosBancarios {

    private String banco;
    private String agencia;
    private int numeroConta;
    private String tipoConta;

    //metodo contr vazio

    public DadosBancarios() {
    }

    //metodo cheio

    public DadosBancarios(String banco, String agencia, int numeroConta, String tipoConta) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
    }

    //getter e setter

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    //toString

    @Override
    public String toString() {
        return "\nDados Bancarios" +
                "\nBanco='" + banco + '\'' +
                ", \nAgencia='" + agencia + '\'' +
                ", \nNumero da Conta=" + numeroConta +
                ", \nTipo da Conta='" + tipoConta;
    }
}
