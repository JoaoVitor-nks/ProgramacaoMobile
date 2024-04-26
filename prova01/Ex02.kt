//Nome: João Vitor de Assis Martins e Eduardo Batista Barboza

/*Escreva um programa que dado um inteiro positivo
calcule e imprima o valor da seguinte soma: F(n)=(1/n)+(2/n-1)+(3/n-2)+...+(n/1) */
fun main() {
    println("Digite um número inteiro e positivo:")
    val n = readLine()!!.toIntOrNull()

    if (n == null || n <= 0) {
        println("Erro: Por favor, insira um número inteiro positivo.")
        return
    }

    var soma = 0.0

    for (i in 1..n) {
        soma += i.toDouble() / (n - i + 1)
    }


    println("O valor de f($n) é $soma")
}