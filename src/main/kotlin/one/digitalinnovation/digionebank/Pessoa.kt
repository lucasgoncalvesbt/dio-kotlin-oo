package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Lucas"
    var cpf: String = "123.456.789.10"
        private set

    constructor()

    fun pessoaInfo() = "$nome : $cpf"

//    inner class Endereco {
//        var rua: String = "Rua da Paz"
//    }
}

fun main() {
    val pessoa = Pessoa()

    println(pessoa.pessoaInfo())

//    println(pessoa.Endereco().rua)
}