package br.com.fiap.entities;

public class DuvidaChatbot {
    private int id;
    private String pergunta;
    private String resposta;
    private Doador doador;

    //metodo Construtor vazio

    public DuvidaChatbot() {
    }

    //metodo construtor cheio

    public DuvidaChatbot(int id, String pergunta, String resposta, Doador doador) {
        this.id = id;
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.doador = doador;
    }

    //getters e setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    //toString

    @Override
    public String toString() {
        return "DuvidaChatbot" +
                "id=" + id +
                ", pergunta='" + pergunta + '\'' +
                ", resposta='" + resposta + '\'' +
                ", doador=" + doador;
    }
}
