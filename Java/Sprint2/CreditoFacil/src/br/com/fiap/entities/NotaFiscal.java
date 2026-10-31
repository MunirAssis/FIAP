package br.com.fiap.entities;

public class NotaFiscal {
    private int id;
    private String cnpjEmissor;
    private double valor;
    private String dataEmissao;
    private String status;
    private Doador doador;
    private LeituraOcr leitura;


    //metodo contrutor vazio
    public NotaFiscal() {
    }

    //metodo construtor cheio

    public NotaFiscal(int id, String cnpjEmissor, double valor, String dataEmissao, String status, Doador doador, LeituraOcr leitura) {
        this.id = id;
        this.cnpjEmissor = cnpjEmissor;
        this.valor = valor;
        this.dataEmissao = dataEmissao;
        this.status = status;
        this.doador = doador;
        this.leitura = leitura;
    }

    //getters e setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpjEmissor() {
        return cnpjEmissor;
    }

    public void setCnpjEmissor(String cnpjEmissor) {
        this.cnpjEmissor = cnpjEmissor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public LeituraOcr getLeitura() {
        return leitura;
    }

    public void setLeitura(LeituraOcr leitura) {
        this.leitura = leitura;
    }

    //toString

    @Override
    public String toString() {
        return "NotaFiscal" +
                "id=" + id +
                ", cnpjEmissor='" + cnpjEmissor + '\'' +
                ", valor=" + valor +
                ", dataEmissao='" + dataEmissao + '\'' +
                ", status='" + status + '\'' +
                ", doador=" + doador +
                ", leitura=" + leitura;
    }
}
