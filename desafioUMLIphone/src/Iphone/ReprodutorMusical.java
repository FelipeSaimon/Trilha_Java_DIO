package Iphone;

public class ReprodutorMusical {

    private int faixaAtual;

    public ReprodutorMusical(int faixa){
        this.faixaAtual = faixa;
    }

    private void tocar(){
        System.out.println("Tocando musica");
    }

    private void pausar(){
        System.out.println("Pausando musica");
    }
    private void trocarMusica(int faixa){
        System.out.println("Trocando musica");
    }
}
