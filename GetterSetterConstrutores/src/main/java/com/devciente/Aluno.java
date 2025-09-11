package com.devciente;

public class Aluno {
    private String nome;
    private int idade;

    // CONSTRUTORES
    public Aluno(){}

    public Aluno(String nome){
        this.nome = nome;
    }

    // GETTERS e SETTERS
    // O prefixo set indica atribuição de um novo valor/estado ao atributo da classe
    // E é seguido pelo nome do atributo, indicando qual atributo está recebendo o novo valor
    public void setNome(String nome){
        this.nome = nome;
    }

    // O prefixo get indica o retorno do valor/estado desse atributo da classe
    // Será exibido/apresentado ou manipulado pela a aplicação
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }
}
