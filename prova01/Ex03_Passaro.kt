class Passaro(nome: String, idade: Int, Sexo: String) : Animal(nome, idade, "fiu fiu fiu", Sexo) {
    // Implementação do método fazerSom para o pássaro
    override fun fazerSom() {
        println("$nome está cantando: $som")
    }
}