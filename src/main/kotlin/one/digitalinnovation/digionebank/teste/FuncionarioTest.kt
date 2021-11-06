package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val pessoa = Pessoa(nome = "Lucas", cpf = "123.456.789-10")
    println(pessoa.pessoaInfo())

    val funcionario = Funcionario(nome = "Lucas", cpf = "123.456.789-10", salario = BigDecimal.valueOf(1000))
}