package com.mycompany.contabanco;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Saimon
 */
public class ContaBanco {

    public static void main(String[] args) {

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, informe o numero de sua conta !");
        numeroConta = ler.nextInt();

        System.out.println("Informe codigo da agencia !");
        agencia = ler.next();

        System.out.println("Informe seu nome.");
        nomeCliente = ler.next();

        System.out.println("Saldo atual");
        saldo = ler.nextDouble();
              
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
