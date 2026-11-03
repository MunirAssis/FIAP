package br.com.fiap.entities;

public class Consentimento {
    private boolean aceite;
    private String dataAceite;
    private String finalidade;


    //metodo construtor vazio:
    public Consentimento() {
    }

    //metodo cheio
    public Consentimento(boolean aceito, String dataAceite, String finalidade) {
        this.aceite = aceito;
        this.dataAceite = dataAceite;
        this.finalidade = finalidade;
    }

    //metodo de funcionalidade | registrar que o Doador autorizou a doação (LGPD)
    public void registrarAceite(String data) {
        this.aceite = true;
        this.dataAceite = data;
        System.out.println("Autorizado a doação em " + data + " para: " + this.finalidade);
    }


    //getters e setters
    public boolean isAceite() {
        return aceite;
    }

    public void setAceito(boolean aceito) {
        this.aceite = aceito;
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
                "aceito=" + aceite +
                ", dataAceite='" + dataAceite + '\'' +
                ", finalidade='" + finalidade ;
    }
}
