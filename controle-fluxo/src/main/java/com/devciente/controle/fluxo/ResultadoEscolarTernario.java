package com.devciente.controle.fluxo;

// Estrutura de controle de fluxo composto
public class ResultadoEscolarTernario {

    public static void main(String[] args) {
        int nota = 6;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);
    }
}
