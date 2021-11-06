package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.ClientTipo
import one.digitalinnovation.digionebank.Cliente

fun main() {
    val jose = Cliente(nome = "Jose", cpf = "45685563", clientTipo = ClientTipo.PF, senha = "123senha")

    println(jose)

    TesteAutenticacao().autentica(jose)
}