package br.com.fiap.entities;

public class Consentimento {
    private boolean aceito;
    private String dataAceite;
    private String finalidade;

    //metodo construtor vazio:
    public Consentimento() {
    }

    //metodo cheio
    public Consentimento(boolean aceito, String dataAceite, String finalidade) {
        this.aceito = aceito;
        this.dataAceite = dataAceite;
        this.finalidade = finalidade;
    }

    //metodo para a funcionalidade
    public void registrarAceite(String data) {
        this.aceito = true;
        this.dataAceite = data;
        System.out.println("Consentimento registrado em" + data + " para" + this.finalidade);
    }


    //getters e setters
    public boolean isAceito() {
        return aceito;
    }

    public void setAceito(boolean aceito) {
        this.aceito = aceito;
    }

    public String getDataAceite() {
        return dataAceite;
    }

    public void setDataAceite(String dataAceite) {
        this.dataAceite = dataAceite;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    //toString

    @Override
    public String toString() {
        return "Consentimento" +
                "aceito=" + aceito +
                ", dataAceite='" + dataAceite + '\'' +
                ", finalidade='" + finalidade;
    }
}
