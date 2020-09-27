class Curso(
    val nomeDoCurso: String,
    val codigoDoCurso: Int,
    val qtdMaximaDeAlunos: Int,
) {

    val listaAlunosMatriculados get() = ArrayList<Aluno>()

    var professorTitular: ProfessorTitular? = null

    var professorAdjunto: ProfessorAdjunto? = null

    fun adicionarAluno(aluno: Aluno) : Boolean {

//        O método retornará true se o aluno puder ser adicionado ou false caso não haja vagas disponíveis.

        // se a lista de de alunos matriculados for igual a quantidade maxima de alunos retorna false
        // se não retorna true

        return if(listaAlunosMatriculados.equals(qtdMaximaDeAlunos) ) {
            false
        } else {
            println("Há vagas. Aluno adicionado")
            true
        }
    }

    fun excluirAluno(aluno: Aluno) {
//        excluir um aluno da listade alunos do curso.

        listaAlunosMatriculados.remove(aluno)

    }
}
