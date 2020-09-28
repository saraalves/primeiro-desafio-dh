class DigitalHouseManager(
    val listaDeAlunos: ArrayList<Aluno>,
    val listaDeProfessores: ArrayList<Professor>,
    val listaDeCursos: ArrayList<Curso>,
    val listaDeMatriculas: ArrayList<Matricula>,
) {

    fun registrarCurso(nomeDoCurso: String, codigoCurso: Int, qtdMAximaDeAlunos: Int){

//        O método deve criar um curso com os dados
//        correspondentes e adicioná-lo à lista de cursos
        val novoCurso = Curso(nomeDoCurso, codigoCurso, qtdMAximaDeAlunos)
        listaDeCursos.add(novoCurso)

    }

    fun excluirCurso(codigoCurso: Int) {

//        Afunção deve utilizar o código do curso para encontrá-lo
//        na lista de cursos e excluí-lo da lista

        if (listaDeCursos.contains(codigoCurso)) {
            listaDeCursos.removeAt(codigoCurso)
        }


    }


    fun registrarProfAdjunto(nome: String, sobrenome: String, codigoProf: Int, tempoDecasa: Int, qtdHorasDisponivel: Int){

//        Criar uma função na classe DigitalHouse Manager​ ​que permite registrar um professor adjunto. A função recebe como parâmetros o nome do professor,
//        o sobrenome, o código e a quantidade de horas disponíveispara monitoria. O tempo de casa inicial do professor será zero. A função deve criar
//        um professor adjunto com os dados correspondentes eadicioná-lo à lista de professores.

        val novoProfAdjunto =  ProfessorAdjunto(nome, sobrenome, codigoProf, tempoDecasa, qtdHorasDisponivel)
        listaDeProfessores.add(novoProfAdjunto)

    }

    fun registrarProfTitular(nome: String, sobrenome: String, codigoProf: Int, tempoDecasa: Int, especialidade: String){

//        O método deve criar um professor titularcom os dados
//        correspondentes e adicioná-lo à lista de professores.

        val novoProfTitular =  ProfessorTitular(nome, sobrenome, codigoProf, tempoDecasa, especialidade)
        listaDeProfessores.add(novoProfTitular)

    }

    fun excluirProfessor(codigoProfessor: Int) {

//        O método deve utilizar o código do professor para encontrá-lo
//        na lista de professores e eliminá-lo da lista.

        if (listaDeProfessores.contains(codigoProfessor)) {
            listaDeCursos.removeAt(codigoProfessor)
        }


    }

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int) {

//        O método deve criar um aluno com os dados

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

        val professorTitular = listaDeProfessores.contains(codigoProfessorTitular)
        val professorAdjunto = listaDeProfessores.contains(codigoprofessorAdjunto)

        // adicionar eles ao curso X
        // como eu faço isso ?
    }

}