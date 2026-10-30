package br.com.fiap.entities;

public class Doacao {
    private int id;
    private double valor;
    private String data;
    private NotaFiscal nota;
    private VinculoNfp vinculo;

    //metodo de construção vazio
    public Doacao() {
    }

    //metodo cheio

    public Doacao(int id, double valor, String data, NotaFiscal nota, VinculoNfp vinculo) {
        this.id = id;
        this.valor = valor;
        this.data = data;
        this.nota = nota;
        this.vinculo = vinculo;
    }

    //GETTERS e setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public NotaFiscal getNota() {
        return nota;
    }

    public void setNota(NotaFiscal nota) {
        this.nota = nota;
    }

    public VinculoNfp getVinculo() {
        return vinculo;
    }

    public void setVinculo(VinculoNfp vinculo) {
        this.vinculo = vinculo;
    }

    //toString

    @Override
    public String toString() {
        return "Doacao" +
                "id=" + id +
                ", valor=" + valor +
                ", data='" + data + '\'' +
                ", nota=" + nota +
                ", vinculo=" + vinculo;
    }
}
