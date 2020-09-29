class ProfessorTitular (nome: String, sobrenome: String, codigoProfessor: Int, tempoDecasa: Int, val especialidade: String) :
    Professor(nome, sobrenome, codigoProfessor, tempoDecasa) {

    override fun toString(): String {
        return "ProfessorTitular(especialidade='$especialidade')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ProfessorTitular

        if (especialidade != other.especialidade) return false

        return true
    }

    override fun hashCode(): Int {
        return especialidade.hashCode()
    }
}