open class Professor (nome: String, sobrenome: String, codigoProfessor: Int, val tempoDeCasa: Int) : Pessoa (nome, sobrenome, codigoProfessor){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Professor

        if (tempoDeCasa != other.tempoDeCasa) return false

        return true
    }

    override fun hashCode(): Int {
        return tempoDeCasa
    }

    override fun toString(): String {
        return "Professor(tempoDeCasa=$tempoDeCasa)"
    }
}