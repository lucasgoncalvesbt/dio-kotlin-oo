package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.ClientTipo

fun main() {
    ClientTipo.values().forEach {
        println("${it.name}: ${it.descricao}")
    }

    val pf = ClientTipo.PF
    println("${pf.name}: ${pf.descricao}")

    val pj = ClientTipo.PJ
    println("${pj.name}: ${pj.descricao}")

}