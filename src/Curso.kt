class Curso(
    val nomeDoCurso: String,
    val codigoDoCurso: Int,
    val qtdMaximaDeAlunos: Int,
) {

    private val listaAlunosMatriculados get() = ArrayList<Aluno>()

    private var professorTitular: ProfessorTitular? = null

    private var professorAdjunto: ProfessorAdjunto? = null

    protected fun adicionarAluno(aluno: Aluno) : Boolean {

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

    protected fun excluirAluno(aluno: Aluno) {
//        excluir um aluno da listade alunos do curso.
        listaAlunosMatriculados.remove(aluno)

    }
}
