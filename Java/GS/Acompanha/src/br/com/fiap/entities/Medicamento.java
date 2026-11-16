package br.com.fiap.entities;

public class Medicamento {
    private int id;
    private String nome;
    private String dosagem;
    private String horario;
    private Idoso idoso;

    //metodo construtor vazio
    public Medicamento() {
    }

    //metodo construtor cheio
    public Medicamento(int id, String nome, String dosagem, String horario, Idoso idoso) {
        this.id = id;
        this.nome = nome;
        this.dosagem = dosagem;
        this.horario = horario;
        this.idoso = idoso;
    }


    //metodo de funcionalidade
    public Lembrete gerarLembrete() {
        String descricao = "Medicamento " + nome + " " + dosagem;
        Lembrete lembrete = new Lembrete(1, descricao, horario, "PENDENTE", 0, idoso);
        return lembrete;
    }

    //getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
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
        return "Medicamento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dosagem='" + dosagem + '\'' +
                ", horario='" + horario + '\'' +
                ", idoso=" + idoso +
                '}';
    }
}
