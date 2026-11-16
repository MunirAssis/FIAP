package com.Acompanha.entities;

public class Alerta {
    private int id;
    private String motivo;
    private String dataHora;
    private boolean enviado;
    private Lembrete lembrete;
    private Familiar familiar;

    //metodo construtor vazio
    public Alerta() {
    }

    //metodo construtor cheio
    public Alerta(int id, String motivo, String dataHora, boolean enviado, Lembrete lembrete, Familiar familiar) {
        this.id = id;
        this.motivo = motivo;
        this.dataHora = dataHora;
        this.enviado = enviado;
        this.lembrete = lembrete;
        this.familiar = familiar;
    }

    //metodo de funcionalidade
    public String enviarAlerta(){
        this.enviado = true;
        return "Alerta para " + familiar.getNome() + ": " + lembrete.getIdoso().getNome() + " não respondeu ao lembrete (" + motivo + ")";
    }
    

    //getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    public Lembrete getLembrete() {
        return lembrete;
    }

    public void setLembrete(Lembrete lembrete) {
        this.lembrete = lembrete;
    }

    public Familiar getFamiliar() {
        return familiar;
    }

    public void setFamiliar(Familiar familiar) {
        this.familiar = familiar;
    }

    //toString
    @Override
    public String toString() {
        return "Alerta" +
                "id=" + id +
                ", motivo='" + motivo + '\'' +
                ", dataHora='" + dataHora + '\'' +
                ", enviado=" + enviado +
                ", lembrete=" + lembrete +
                ", familiar=" + familiar;
    }
}
