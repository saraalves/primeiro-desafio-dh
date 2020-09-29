class Curso(
    val nomeDoCurso: String,
    val codigoDoCurso: Int,
    val qtdMaximaDeAlunos: Int,
    val listaDeAlunosMatriculados: ArrayList<Aluno>

//    var alunosMatriculados: MutableList<Aluno> = mutableListOf() )
) {

    var listaAlunosMatriculados = mutableListOf<Aluno>()

    val professorTitular: ProfessorTitular? = null

    val professorAdjunto: ProfessorAdjunto? = null

    fun adicionarAluno(umAluno: Aluno) : Boolean {

        return if(listaAlunosMatriculados.size < qtdMaximaDeAlunos) {

            listaAlunosMatriculados.add(umAluno)
            println("Há vagas. O $umAluno foi adicionado")
            true

        } else {
            println("Não há vagas")
            false

        }
    }

    fun excluirAluno(umAluno: Aluno) {
        listaAlunosMatriculados.remove(umAluno)
        println("O $umAluno foi removido")
    }

    override fun toString(): String {
        return "Curso(nomeDoCurso='$nomeDoCurso', codigoDoCurso=$codigoDoCurso, qtdMaximaDeAlunos=$qtdMaximaDeAlunos, listaDeAlunosMatriculados=$listaDeAlunosMatriculados, professorTitular=$professorTitular, professorAdjunto=$professorAdjunto)"
    }

}
