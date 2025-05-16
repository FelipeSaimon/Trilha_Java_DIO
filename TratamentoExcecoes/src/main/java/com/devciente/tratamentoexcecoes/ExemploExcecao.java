/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devciente.tratamentoexcecoes;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");

        // Como a "string" a1.75 não poderia ser convertida para numérico,
        // deve-se tratar uma possivel exceção considerando numéros em formatos
        // que podem não ser convertidos em números
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
        } catch (ParseException ex) {
            Logger.getLogger(ExemploExcecao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(valor);
       
    }
}
