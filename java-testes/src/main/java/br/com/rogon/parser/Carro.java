package br.com.rogon.parser;

import com.google.gson.annotations.SerializedName;

public class Carro {
    @SerializedName("NM_CARRO")
    private String nome;
    @SerializedName("ANO_CARRO")
    private Integer ano;

    public Carro(String nome, Integer ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public Carro(){}

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Carro [nome=" + nome + ", ano=" + ano + "]";
    }
}
