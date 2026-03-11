package Iphone;

public class Telefone {
    private String numeroDiscado;

    private void ligarAparelho() {
        System.out.println("Ligando aparelho");
    }
    private void desligarAparelho() {
        System.out.println("Desligando aparelho");
    }

    private void fazerChamada(String numero){
        if(numeroDiscado == numero){
            System.out.println("Ligando para fulano");
        }else{
            System.out.println("numero discado está fora de área ou não existe!");
        }
    }
}
