package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digionebank = Banco(nome = "DigiOne Bank", numero = 12)

    println(digionebank.info())

    val digionebank2 = digionebank.copy()

    println(digionebank2.info())
}