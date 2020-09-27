class Curso(
    val nomeDoCurso: String,
    val codigoDoCurso: Int,
    val qtdMaximaDeAlunos: Int,
) {

    val listaAlunos get() = ArrayList<Aluno>()

    var professorTitular: ProfessorTitular? = null

    var professorAdjunto: ProfessorAdjunto? = null

    fun adicionarAluno(aluno: Aluno) : Boolean {

//        O método retornará true se o aluno puder ser adicionado ou false casonão haja vagas disponíveis.

        return true
    }

    fun excluirAluno(aluno: Aluno) {

//        excluir um aluno da listade alunos do curso.


    }
}