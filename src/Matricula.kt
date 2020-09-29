import java.time.LocalDateTime
import java.util.*

class Matricula (val aluno: Aluno, val curso: Curso, var dataDaMatricula: LocalDateTime) {

    init {
        dataDaMatricula = LocalDateTime.now()
    }
}