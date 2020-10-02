data class DigitalHouseManager(
    var listaDeAlunos: MutableList<Aluno> = mutableListOf(),
    var listaDeProfessores: MutableList<Professor> = mutableListOf(),
    var listaDeCursos: MutableList<Curso> = mutableListOf(),
    var listaDeMatriculas: MutableList<Matricula> = mutableListOf(),
) {

    private val codigoCurso = Curso()
    private val codigoAluno = Aluno()


    fun registrarCurso(nomeDoCurso: String, codigoCurso: Int, qtdMAximaDeAlunos: Int){

        val novoCurso = Curso(nomeDoCurso, codigoCurso, qtdMAximaDeAlunos)
        listaDeCursos.add(novoCurso)
    }

    fun excluirCurso(codigoCurso: Int) {

        listaDeCursos = listaDeCursos.filter {
            it.codigoDoCurso != codigoCurso
        } as MutableList<Curso>
    }

    fun registrarProfAdjunto(nome: String, sobrenome: String, codigoProf: Int, tempoDecasa: Int, qtdHorasDisponivel: Int){

        val novoProfAdjunto =  ProfessorAdjunto(nome, sobrenome, codigoProf, tempoDecasa, qtdHorasDisponivel)
        listaDeProfessores.add(novoProfAdjunto)

    }

    fun registrarProfTitular(nome: String, sobrenome: String, codigoProf: Int, tempoDecasa: Int, especialidade: String){

        val novoProfTitular =  ProfessorTitular(nome, sobrenome, codigoProf, tempoDecasa, especialidade)
        listaDeProfessores.add(novoProfTitular)

    }

    fun excluirProfessor(codigoProfessor: Int) {

        listaDeProfessores = listaDeProfessores.filter {
            it.codigo != codigoProfessor
        } as MutableList<Professor>
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {

        val novoAluno = Aluno(nome, sobrenome, codigoAluno)
        listaDeAlunos.add(novoAluno)

    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {

//        Encontrar o curso em que o aluno está se matriculando.
//        Encontrar o aluno que queremos matricular.
//        Matricular o aluno, se for possível.
//        No caso de ser possível, criar uma matrícula e configurá-la com osdados correspondentes.
//          Adicionar a matrícula à lista de matrículas.○Informar na tela que a matrícula foi realizada.
//        Se não houver vagas disponíveis:
//          Informar na tela que não foi possível realizar a matrícula porque não há vagas

        val matricula = listaDeCursos.contains(codigoCurso)
        val aluno =  listaDeAlunos.contains(codigoAluno)





    }

    fun alocarProfessor(codigoCurso: Int, codigoProfessorTitular: Int, codigoprofessorAdjunto: Int) {

//        Encontrar o professor titular na lista de professores.
//        Encontrar o professor adjunto na lista de professores.
//        Alocar ambos professores ao curso.

        val professorTitular = listaDeProfessores?.contains(codigoProfessorTitular)
        val professorAdjunto = listaDeProfessores?.contains(codigoprofessorAdjunto)

        // adicionar eles ao curso X
        // como eu faço isso ?
    }


}