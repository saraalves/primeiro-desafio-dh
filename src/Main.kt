fun main() {

    val digitalHouseManager = DigitalHouseManager()


//
//    val professorAdjunto1 = ProfessorAdjunto("Veronika", "Junqueira", 1, 5, 5)
//    val professorAdjunto2 = ProfessorAdjunto("Olga ", "Rico", 2, 6, 10)
//    val professorAdjunto3 = ProfessorAdjunto("Veronika", "Junqueira", 3, 7, 15)
//    val professorAdjunto4 = ProfessorAdjunto("Veronika", "Junqueira", 4, 8, 20)
//    val professorAdjunto5 = ProfessorAdjunto("Veronika", "Junqueira", 5, 9, 25)
//
//    val listaProfessorAdjunto = arrayListOf<Professor>(professorAdjunto1, professorAdjunto2, professorAdjunto3, professorAdjunto4, professorAdjunto5)
//
//
//    val curso1 =  Curso("Matemática", 1, 5)
//
//    if(listaAlunos.size < curso1.qtdMaximaDeAlunos) {
//        curso1.adicionarAluno(novoAluno)
//    } else {
//        println("Aluno recusado")
//    }
//
//    curso1.excluirAluno(listaAlunos[4])

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
    val curso = Curso()
    curso.excluirAluno(digitalHouseManager.listaDeAlunos[3])

}