package com.devciente.controle.fluxo;

// Estrutura de controle de fluxo encadeado
public class ResultadoEscolarEncadeado {

    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
