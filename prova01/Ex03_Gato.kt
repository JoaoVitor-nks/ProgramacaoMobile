class Gato(nome: String, idade: Int, Sexo: String) : Animal(nome, idade, "Mhiiauuuuuu", Sexo) {
    // Implementação do método fazerSom para o pássaro
    override fun fazerSom() {
        println("$nome está miando: $som")
    }
}