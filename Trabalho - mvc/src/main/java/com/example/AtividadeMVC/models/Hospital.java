package com.example.AtividadeMVC.models;

public class Hospital {
    private String nome;
    private String especializacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public Hospital(String nome, String especializacao) {
        this.nome = nome;
        this.especializacao = especializacao;
    }
}