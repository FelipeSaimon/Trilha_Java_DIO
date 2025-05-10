package com.devciente.controle.fluxo;

// Estrutura de controle de fluxo simples
public class CaixaEletronico {
    public static void main(String[] args) {
        //Valores validos
//        double saldo = 25.0;
//        double valorSolicitado = 17.0;

        //Valores invalidos
        double saldo = 25.0;
        double valorSolicitado = 28.0;
        
        
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        }
        // Quando o valorSolicitado é maior que o saldo, o valor retornado/exibido é o valor atual do saldo.
        // Depurar o projeto/codigo nos ajuda a compreender o que está sendo feito naquele ponto.

        System.out.println(saldo);
    }
    
}
