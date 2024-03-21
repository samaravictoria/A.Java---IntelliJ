package br.com.tds.model;

public class Aviao {
    private String modelo;
    private int quantidadeLugares;
    private String prefixo;
    private double comprimento;
    private int anoFabricacao;
    private Cor verdeEscuro;
    private int quantidadeTurbinas;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidadeLugares() {
        return quantidadeLugares;
    }

    public void setQuantidadeLugares(int quantidadeLugares) {
        this.quantidadeLugares = quantidadeLugares;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Cor getverdeEscuro() {
        return verdeEscuro;
    }

    public void setverdeEscuro(Cor verdeEscuro) {
        this.verdeEscuro = verdeEscuro;
    }

    public int getQuantidadeTurbinas() {
        return quantidadeTurbinas;
    }

    public void setQuantidadeTurbinas(int quantidadeTurbinas) {
        this.quantidadeTurbinas = quantidadeTurbinas;
    }
}
