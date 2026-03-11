```mermaid
classDiagram

class Iphone

class ReprodutorMusical {
    <<interface>>
    +tocar()
    +pausar()
    +trocarMusica(int faixaMusica)
}

class Telefone {
    <<interface>>
    +ligarAparelho()
    +fazerChamada(String numero)
    +desligarAparelho()
}

class Navegador {
    <<interface>>
    +abrirNavegador()
}

Iphone ..|> ReprodutorMusical
Iphone ..|> Telefone
Iphone ..|> Navegador
