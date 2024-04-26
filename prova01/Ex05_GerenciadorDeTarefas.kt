class GerenciadorDeTarefas {
    private val tarefas = mutableListOf<Tarefa>()

    fun adicionarTarefa(tarefa: Tarefa) {
        tarefas.add(tarefa)
    }

    fun removerTarefa(tarefa: Tarefa) {
        tarefas.remove(tarefa)
    }

    fun buscarTarefa(titulo: String): Tarefa? {
        return tarefas.find { it.titulo == titulo }
    }

    fun marcarComoConcluida(titulo: String) {
        tarefas.find { it.titulo == titulo }?.concluida = true
    }

    fun listarTarefasPorDataVencimento(): List<Tarefa> {
        return tarefas.sortedBy { it.dataVencimento }
    }

    fun listarTarefasConcluidas(): List<Tarefa> {
        return tarefas.filter { it.concluida }
    }

    fun listarTarefasNaoConcluidas(): List<Tarefa> {
        return tarefas.filterNot { it.concluida }
    }

    override fun toString(): String {
        return tarefas.joinToString(separator = "\n") { tarefa ->
            "${tarefa.titulo} - Vence em: ${tarefa.dataVencimento} - " +
                    "Prioridade: ${tarefa.prioridade} - Concluída: ${tarefa.concluida}"
        }
    }
}