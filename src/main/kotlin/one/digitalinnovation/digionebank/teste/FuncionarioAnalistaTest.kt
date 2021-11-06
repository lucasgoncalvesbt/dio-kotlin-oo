package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import one.digitalinnovation.digionebank.teste.imprimeRelatorioFuncionario.Companion.imprimeRelatorio
import java.math.BigDecimal

fun main() {
    val pessoa = Analista(nome = "Lucas", cpf = "123.456.789-10", salario = 5000.0)

    imprimeRelatorio(pessoa)
}