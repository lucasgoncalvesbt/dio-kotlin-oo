package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.teste.imprimeRelatorioFuncionario.Companion.imprimeRelatorio

fun main() {
    val pessoa = Gerente(nome = "Lucas", cpf = "123.456.789-10", salario = 10000.0)

    imprimeRelatorio(pessoa)
}

