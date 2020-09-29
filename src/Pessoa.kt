abstract class Pessoa (val nome: String, val sobrenome: String, val codigo: Int) {

    override fun toString(): String {
        return "Pessoa(nome='$nome', sobrenome='$sobrenome', codigo=$codigo)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Pessoa

        if (nome != other.nome) return false
        if (sobrenome != other.sobrenome) return false
        if (codigo != other.codigo) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nome.hashCode()
        result = 31 * result + sobrenome.hashCode()
        result = 31 * result + codigo
        return result
    }
}