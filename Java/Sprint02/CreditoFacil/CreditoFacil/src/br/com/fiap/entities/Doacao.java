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

    //metodo de funcionalidade | Estima o credito gerado se a nota for elegivel calculando uma % do valor
    public double calcularCredito(){
        if (nota.getStatus().equals("Valido")){
            double taxa = 0.30;
            double credito = nota.getValor() * taxa;
            System.out.println("Crédito estimado com sucesso: R$ " + credito);
            return credito;
        }
        System.out.println("Nota fiscal não é elegível para crédito. Valor do crédito: R$ 0,00");
        return 0;
    } //se NotaFiscal->status = Valido valor x 0.3, se n -> enelegivel

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
        return "ID: " + id +
                "\nValor: R$ " + valor +
                "\nData: " + data +
                "\nNota fiscal vinculada: " + (nota != null ? nota.getId() : "-") +
                "\nVínculo: " + (vinculo != null ? vinculo.getId() : "-");
    }
}
