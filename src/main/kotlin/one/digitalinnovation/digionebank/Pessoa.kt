package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Lucas"
    var cpf: String = "123.456.789.10"
        private set

//    inner class Endereco {
//        var rua: String = "Rua da Paz"
//    }
}

fun main() {
    val pessoa = Pessoa()

    println(pessoa.nome)
    println(pessoa.cpf)

//    println(pessoa.Endereco().rua)
}