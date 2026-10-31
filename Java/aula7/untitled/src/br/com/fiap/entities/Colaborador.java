package br.com.fiap.entities;

public class Colaborador {

    private int NumRegistro;
    private String Nome;
    private String Cargo;
    private double quantidadeHoras;
    private double valorHora;
    private double Percentual;

    //void

    public Colaborador() {
    }

    //


    public Colaborador(int numRegistro, String nome, String cargo, double quantidadeHoras, double valorHora, double percentual) {
        NumRegistro = numRegistro;
        Nome = nome;
        Cargo = cargo;
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
        Percentual = percentual;
    }

    public int getNumRegistro() {
        return NumRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        NumRegistro = numRegistro;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getPercentual() {
        return Percentual;
    }

    public void setPercentual(double percentual) {
        Percentual = percentual;
    }

    @Override
    public String toString() {
        return "Colaborador" +
                "NumRegistro=" + NumRegistro +
                ", Nome='" + Nome + '\'' +
                ", Cargo='" + Cargo + '\'' +
                ", quantidadeHoras=" + quantidadeHoras +
                ", valorHora=" + valorHora +
                ", Percentual=" + Percentual;
    }

    //calcularSalario()
    public double calcularSalario(){
        return valorHora + quantidadeHoras;
    }

    public double calcularIr(){
        double calculo = 0;
        if(calcularSalario() > 7350.00) {
            this.Percentual = 27.5;
            calculo = calcularSalario() * Percentual / 100;
        }else if(calcularSalario() >= 5000.00){
            this.Percentual = 7.5;
            calculo = calcularSalario() * Percentual / 100;
        }else{
            this.Percentual = 0;
            calculo = Percentual;
        }
        return calculo;
    }
    //InfoStatus
    public String InfoStatus(){
        String informacao = null;
        if (calcularSalario() > 7350.00) {
            informacao = "contribuinte de Ir com 27.5%";
        }else  if(calcularSalario() > 5000){

        }
    }
}
