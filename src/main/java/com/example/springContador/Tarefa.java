package com.example.springContador;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private String responsavel;

    public Tarefa(String descricao, boolean concluida, String responsavel) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.responsavel = responsavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                ", pessoaResponsavel='" + responsavel + '\'' +
                '}';
    }
}
