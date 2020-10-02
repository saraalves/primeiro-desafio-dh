fun main() {

    val digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarCurso("Administração", 5, 20)
    digitalHouseManager.registrarCurso("Marketing", 10, 30)
    digitalHouseManager.registrarCurso("Marketing", 15, 40)
    digitalHouseManager.registrarCurso("Marketing", 15, 40)

    println(digitalHouseManager.listaDeCursos)
    digitalHouseManager.excluirCurso(10)
    println(digitalHouseManager.listaDeCursos)

    digitalHouseManager.registrarProfTitular("Eduardo", "Omar", 1, 5,"matemática")
    digitalHouseManager.registrarProfTitular("Ânia ", "Cangueiro", 2, 6, "física")
    digitalHouseManager.registrarProfAdjunto("Samanta ", "Ornelas", 3, 7, 40)
    digitalHouseManager.registrarProfTitular("Clarisse ", "Landin", 4, 8, "química")
    digitalHouseManager.registrarProfAdjunto("Belchior ", "Poença", 5, 9, 30)

    println(digitalHouseManager.listaDeProfessores)
    digitalHouseManager.excluirProfessor(5)
    println(digitalHouseManager.listaDeProfessores)

    digitalHouseManager.matricularAluno("Renato", "Gusmão", 1)
    digitalHouseManager.matricularAluno("João", "Alberto", 2)
    digitalHouseManager.matricularAluno("Mariana", "Silva", 3)
    digitalHouseManager.matricularAluno("César", "Santo", 4 )
    digitalHouseManager.matricularAluno("Jéssica", "Maria", 5 )

    println(digitalHouseManager.listaDeAlunos)

    val aluno1 = Aluno("Roberta", "Silva", 1)
    val aluno2 = Aluno("Luiz", "Araujo", 2)
    val aluno3 = Aluno("Julio", "Alves", 3)
    val aluno4 = Aluno("Bruna", "Gomes", 4)
    val aluno5 = Aluno("Isabela", "Cardoso", 5)

    val novoAluno = Aluno("Lucas", "Silva", 6)

    var curso1 = Curso("Lógica de programação", 1, 5)


    curso1.adicionarAluno(aluno1)
    println(curso1.listaDeAlunosMatriculados.size)

    curso1.adicionarAluno(aluno2)
    println(curso1.listaDeAlunosMatriculados.size)

    curso1.adicionarAluno(aluno3)
    println(curso1.listaDeAlunosMatriculados.size)

    curso1.adicionarAluno(aluno4)
    println(curso1.listaDeAlunosMatriculados.size)

    curso1.adicionarAluno(aluno5)
    println(curso1.listaDeAlunosMatriculados.size)

    curso1.adicionarAluno(novoAluno)
    println(curso1.listaDeAlunosMatriculados.size)

    curso1.excluirAluno(aluno3)
    println(curso1.listaDeAlunosMatriculados.size)

    try {
        digitalHouseManager.matricularAluno(1, 5)
        digitalHouseManager.matricularAluno(2, 4)
        digitalHouseManager.matricularAluno(3, 3)
        digitalHouseManager.matricularAluno(4, 2)
        digitalHouseManager.matricularAluno(5, 1)
        println(digitalHouseManager.listaDeCursos)
    } catch (e: Exception) {
        return println(e.message)
    }

    try {
        digitalHouseManager.alocarProfessor(1, 5, 10)
        digitalHouseManager.alocarProfessor(2, 4, 5)
        digitalHouseManager.alocarProfessor(3, 3, 15)
        digitalHouseManager.alocarProfessor(4, 2, 20)
        digitalHouseManager.alocarProfessor(5, 1, 25)
    } catch (e: Exception) {
        return println(e.message)
    }
}

