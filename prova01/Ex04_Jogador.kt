class Jogador {
    //Esta função receberCartas recebe uma lista de cartas como entrada e imprime as cartas recebidas.

    fun receberCartas(cartas: List<Carta>) {
        println("Recebidas as cartas: ${cartas.joinToString(", ")}")

        // Análise das combinações
        if (isFlush(cartas)) {
            println("Flush: Todas as cartas têm o mesmo naipe!")
        } else if (isFullHouse(cartas)) {
            println("Full House: Uma trinca e um par!")
        } else if (isTrinca(cartas)) {
            println("Trinca: Três cartas com o mesmo valor!")
        } else if (isPar(cartas)) {
            println("Par: Duas cartas com o mesmo valor!")
        } else {
            println("Nenhuma combinação encontrada.")
        }
    }

    //funcões para cada tipo de combinação
    private fun isFlush(cartas: List<Carta>): Boolean = cartas.map { it.naipe }.toSet().size == 1

    private fun isFullHouse(cartas: List<Carta>): Boolean {
        val valores = cartas.groupingBy { it.valor }.eachCount()
        return valores.containsValue(3) && valores.containsValue(2)
    }

    private fun isTrinca(cartas: List<Carta>): Boolean = cartas.groupingBy { it.valor }.eachCount().any { it.value == 3 }

    private fun isPar(cartas: List<Carta>): Boolean = cartas.groupingBy { it.valor }.eachCount().any { it.value == 2 }
}