package com.example.opet.tds_firestore;

public class Produto {

    public String nome;
    public String unidade;
    public Boolean perecivel;
    public Integer quantidade;
    public Double valor;

    public Produto() {
    }

    public Produto(String nome, String unidade, Boolean perecivel, Integer quantidade, Double valor) {
        this.nome = nome;
        this.unidade = unidade;
        this.perecivel = perecivel;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Boolean getPerecivel() {
        return perecivel;
    }

    public void setPerecivel(Boolean perecivel) {
        this.perecivel = perecivel;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
