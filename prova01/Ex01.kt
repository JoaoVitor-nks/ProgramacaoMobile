//Nome: João Vitor de Assis Martins e Eduardo Batista Barboza

/*Escreva um programa que leia um número entre 1 e 12 correspondendo
 a um mês do ano e imprima o nome desse mês. Utilize o comando when. Caso o valor
 seja fora deste intevalo, imprima uma mensagem de erro.*/
fun main() {
    println("Digite um número entre 1 e 12 correspondente a um mês do ano:")
    val numeroMes = readLine()?.toIntOrNull()


    // Verifica se o número está dentro do intervalo permitido (1 a 12)
    when (numeroMes) {
        in 1..12 -> {
            val nomeMes = when (numeroMes) {
                1 -> "Janeiro"
                2 -> "Fevereiro"
                3 -> "Março"
                4 -> "Abril"
                5 -> "Maio"
                6 -> "Junho"
                7 -> "Julho"
                8 -> "Agosto"
                9 -> "Setembro"
                10 -> "Outubro"
                11 -> "Novembro"
                12 -> "Dezembro"
                else -> ""
            }
            println("O mês correspondente ao número $numeroMes é $nomeMes.")
        }
        else -> {
            println("Número inválido! Por favor, insira um número entre 1 e 12.")
        }
    }
}