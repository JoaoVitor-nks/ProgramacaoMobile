class Baralho {
    private val naipes = arrayOf("♠️", "♥️", "♦️", "♣️")
    private val valores = arrayOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
    private val cartas = mutableListOf<Carta>()

    //cria as 52 cartas do baralho
    init {
        for (naipe in naipes) {
            for (valor in valores) {
                cartas.add(Carta(valor, naipe))
            }
        }
    }

    //Faz um emparalhamento automatico
    fun embaralhar() {
        cartas.shuffle()
    }

    //distribui cartas aleatorias e com  a quantidade correta
    fun distribuir(qtd: Int): List<Carta> {
        if (cartas.size < qtd) throw IllegalStateException("Não há cartas suficientes no baralho para distribuir.")
        return cartas.take(qtd).also {
            cartas.removeAll(it)
        }
    }
}