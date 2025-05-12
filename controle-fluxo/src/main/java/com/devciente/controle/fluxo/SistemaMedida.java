/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devciente.controle.fluxo;

// SistemaMedida.java
// Modo condicional if/else
public class SistemaMedida {

//    public static void main(String[] args) {
//        String sigla = "M";
//
//        switch (sigla) {
//            case "P": {
//                System.out.println("PEQUENO");
//                break;
//            }
//            case "M": {
//                System.out.println("MEDIO");
//                break;
//            }
//            case "G": {
//                System.out.println("GRANDE");
//                break;
//            }
//            default:
//                System.out.println("INDEFINIDO");
//        }
//
//    };
    public static void main(String[] args) {
        double alturaJoao = 1.46;
        double alturaMarcos = 1.37;
        if (alturaMarcos > alturaJoao) {
            System.out.println("João é mais alto que Marcos");
        } else {
            System.out.println("Marcos é mais baixo que João");
        }
    }
}
