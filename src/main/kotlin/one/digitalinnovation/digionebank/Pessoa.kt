package one.digitalinnovation.digionebank

abstract class Pessoa(
    var nome: String,
    var cpf: String,
) {

    fun pessoaInfo() = "$nome : $cpf"

//    inner class Endereco {
//        var rua: String = "Rua da Paz"
//    }
}

