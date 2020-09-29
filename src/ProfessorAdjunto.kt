class ProfessorAdjunto (nome: String, sobrenome: String, codigoProfessor: Int, tempoDeCasa: Int, val qtdHorasDeMonitoria: Int,

) : Professor(nome, sobrenome, codigoProfessor, tempoDeCasa,) {

    override fun toString(): String {
        return "ProfessorAdjunto(qtdHorasDeMonitoria=$qtdHorasDeMonitoria)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ProfessorAdjunto

        if (qtdHorasDeMonitoria != other.qtdHorasDeMonitoria) return false

        return true
    }

    override fun hashCode(): Int {
        return qtdHorasDeMonitoria
    }
}