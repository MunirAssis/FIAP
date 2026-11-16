package com.Acompanha.entities;

public class Lembrete {
    private int id;
    private String tipo;
    private String horario;
    private String status;
    private int tentativas;
    private Idoso idoso;

    //metodo construtor vazio
    public Lembrete() {
    }

    //metodo construtor cheio
    public Lembrete(int id, String tipo, String horario, String status, int tentativas, Idoso idoso) {
        this.id = id;
        this.tipo = tipo;
        this.horario = horario;
        this.status = status;
        this.tentativas = tentativas;
        this.idoso = idoso;
    }

    //metodos de funcionalidade
    public String enviar() {
        this.tentativas = this.tentativas + 1;
        return "Lembrete para" + idoso.getNome() + ":" + tipo + "às" + horario + "(tentativas)" + tentativas + ")";
    }//Esse metodo funciona para enviar o lembrete e conta as tentivas, e isso (junto com tentativas) permite saber se o idoso ignorou os avisos

    public void confirmar() {
        this.status = "Confirmado";
    }//muda os status (Não precisa devolver nada)

    public boolean semResposta() {
        if (status.equals("Pendentes") && tentativas >= 2) {
            return true;
        } else {
            return false;
        }
    }//se o status ainda estiver pendente e o lembrete ja enviado 2X ou mais "ativa" o semResposta


    //getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
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
        return "Lembrete" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", horario='" + horario + '\'' +
                ", status='" + status + '\'' +
                ", tentativas=" + tentativas +
                ", idoso=" + idoso;
    }
}
