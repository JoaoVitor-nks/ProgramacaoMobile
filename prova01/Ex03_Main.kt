//Nome: João Vitor de Assis Martins e Eduardo Batista Barboza

/*Crie uma classe abstrata Animal com atributos como nome, idade e som.
 Crie classes derivadas de Animal para representar diferentes tipos de animais,
  como cachorro, gato e pássaro. Implemente métodos específicos para cada tipo de animal
  , como latir, miar e cantar. Utilize herança e polimorfismo para criar uma lista
   de animais e exibir informações sobre cada um deles.*/

fun main() {
    // Lista de animais
    val listaAnimais = listOf(
        Cachorro("Dolly", 3, "Macho"),
        Gato("Bruxo", 5, "Fêmea"),
        Passaro("Var", 2, "Macho")
    )

    // interação sobre a lista e exibir informações sobre cada animal
    for (animal in listaAnimais) {
        println("Nome: ${animal.nome}, Idade: ${animal.idade}, Sexo: ${animal.Sexo}")
        // Faz uma chamada do Som por polimorfismo
        animal.fazerSom()
        println()
    }
}