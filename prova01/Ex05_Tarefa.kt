import java.time.LocalDate

data class Tarefa(
    val titulo: String,
    val descricao: String,
    val dataVencimento: LocalDate,
    val prioridade: Int,
    var concluida: Boolean = false
)