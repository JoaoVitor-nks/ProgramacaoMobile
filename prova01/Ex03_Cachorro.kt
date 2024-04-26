class Cachorro(nome: String, idade: Int, Sexo: String) : Animal(nome, idade, "Rhhhaarrrr", Sexo) {
    // Implementação do método fazerSom para o pássaro
    override fun fazerSom() {
        println("$nome está Latindo: $som")
    }
}