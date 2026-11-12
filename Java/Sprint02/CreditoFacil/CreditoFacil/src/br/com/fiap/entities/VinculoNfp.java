package br.com.fiap.entities;
//classe para ligar um vinculo do Doador & Instituição
public class VinculoNfp {
    private int id;
    private String dataVinculo;
    private String status;
    private Doador doador;
    private Instituicao instituicao;

    //metodo construtor vazio
    public VinculoNfp() {
    }

    //metodos cheio
    public VinculoNfp(int id, String dataVinculo, String status, Doador doador, Instituicao instituicao) {
        this.id = id;
        this.dataVinculo = dataVinculo;
        this.status = status;
        this.doador = doador;
        this.instituicao = instituicao;
    }

    //metodo de funcionalidade | liga o Doador a Instituição, mas so se tiver aceito consentimento
    public boolean ativar(){
        if(doador.getConsentimento().isAceite()) {
            this.status = "Ativo";
            System.out.println("Vínculo ativado com sucesso entre " + doador.getNome() + " e " + instituicao.getNome() + "!");
            return true;
        }
        this.status = "Pendente";
        return false;
    } //se

    //getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataVinculo() {
        return dataVinculo;
    }

    public void setDataVinculo(String dataVinculo) {
        this.dataVinculo = dataVinculo;
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

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    //toString
    @Override
    public String toString() {
        return "ID: " + id +
                "\nData do vínculo: " + dataVinculo +
                "\nStatus: " + status +
                "\nDoador: " + (doador != null ? doador.getNome() : "-") +
                "\nInstituição: " + (instituicao != null ? instituicao.getNome() : "-");
    }
}
