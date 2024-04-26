//Nome: João Vitor de Assis Martins e Eduardo Batista Barboza

/*Crie uma classe Carta que represente uma carta de baralho com atributos como
naipe e valor. Crie uma classe Baralhoque represente um baralho de cartas completo.
Implemente métodos para embaralhar o baralho, distribuir cartas. Entregue 5 cartas
para um Jogador que vai verificar se as cartas possuem combinações vencedoras, como:*/

fun main() {
    val baralho = Baralho()
    baralho.embaralhar()

    val jogador = Jogador()
    val cartasRecebidas = baralho.distribuir(5)
    jogador.receberCartas(cartasRecebidas)
}