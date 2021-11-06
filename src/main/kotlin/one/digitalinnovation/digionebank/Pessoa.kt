package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Lucas"
    var cpf: String = "123.456.789.10"
}

fun main() {
    val pessoa = Pessoa()

    println(pessoa.nome)
    println(pessoa.cpf)
}