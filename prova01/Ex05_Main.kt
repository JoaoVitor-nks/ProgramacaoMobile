import java.time.LocalDate
//Nome: João Vitor de Assis Martins e Eduardo Batista Barboza

//Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título
// , descrição, data de vencimento e prioridade. Crie uma classe GerenciadorDeTarefas que gerencie
// uma lista de tarefas. Implemente métodos para adicionar, remover, buscar, marcar como concluída
// e listar tarefas por data de vencimento.

fun main() {
    val gerenciador = GerenciadorDeTarefas()

    // Adicionar algumas tarefas
    gerenciador.adicionarTarefa(Tarefa("fazer yoga", "ir todos os dias", LocalDate.of(2024, 4, 23), 1))
    gerenciador.adicionarTarefa(Tarefa("apostar", "Fazer aposta diariamente até falir", LocalDate.of(2024, 5, 1), 3))
    gerenciador.adicionarTarefa(Tarefa("trabalhar", "Fazer de tudo para nunca fazer isso", LocalDate.of(2024, 4, 25), 2))

    // Marcar uma tarefa como concluída
    gerenciador.marcarComoConcluida("apostar")
    // Listar tarefas
    println("Todas as Tarefas:")
    println(gerenciador)

    // Listar tarefas concluídas
    println("\nTarefas Concluídas:")
    gerenciador.listarTarefasConcluidas().forEach {
        println(it)
    }

    // Listar tarefas por data de vencimento
    println("\nTarefas por Data de Vencimento:")
    gerenciador.listarTarefasPorDataVencimento().forEach {
        println(it)
    }
    // Listar tarefas Concluidas
    println("\nTarefas concluidas:")
    gerenciador.listarTarefasConcluidas().forEach {
        println(it)
    }

    // Listar tarefas Não Concluidas
    println("\nTarefas Não concluidas:")
    gerenciador.listarTarefasNaoConcluidas().forEach {
        println(it)
    }
    println()
    gerenciador.removerTarefa(Tarefa("fazer yoga", "ir todos os dias", LocalDate.of(2024, 4, 23), 1))
    println("tarefa removida")
    println()
    // Listar tarefas
    println("Todas as Tarefas:")
    println(gerenciador)
}