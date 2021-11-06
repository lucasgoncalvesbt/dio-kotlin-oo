package one.digitalinnovation.digionebank

class Cliente(
    nome: String,
    cpf: String,
    val clientTipo: ClientTipo,
    val senha: String
) : Pessoa(nome, cpf), Logavel {

    override fun login(): Boolean = "123senha" == senha

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Tipo: ${clientTipo.descricao}
        
    """.trimIndent()
}