package com.Acompanha.entities;

public class Consulta {
    private int id;
    private String especialidade;
    private String medico;
    private String dataHora;
    private Idoso idoso;

    //metodo construtor vazio
    public Consulta() {
    }

    //metodo construtor cheio
    public Consulta(int id, String especialidade, String medico, String dataHora, Idoso idoso) {
        this.id = id;
        this.especialidade = especialidade;
        this.medico = medico;
        this.dataHora = dataHora;
        this.idoso = idoso;
    }

    //metodo de funcionalidade
    public Lembrete gerarLembrete() {
        String descricao = "Consulta " + especialidade + "com " + medico;
        Lembrete lembrete = new Lembrete(1, descricao, dataHora, "Pendente", 0, idoso);
        return lembrete;
    }

    //getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public Idoso getIdoso() {
        return idoso;
    }

    public void setIdoso(Idoso idoso) {
        this.idoso = idoso;
    }

    //toString
    @Override
    public String toString() {
        return "Consulta" +
                "id=" + id +
                ", especialidade='" + especialidade + '\'' +
                ", medico='" + medico + '\'' +
                ", dataHora='" + dataHora + '\'' +
                ", idoso=" + idoso;
    }
}
