/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devciente.tratamentoexcecoes;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saimon
 */
public class FormatadorCepExemplo {
    
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("29500000");
            System.out.println("Cep formatado, "+ cepFormatado);
        } catch (CepInvalidoException ex) {
            Logger.getLogger(FormatadorCepExemplo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        else{
            // Formatar a string para retornar 29.500-000
        }
          //simulando um cep formatado
          return "23.765-064";
    }
}
