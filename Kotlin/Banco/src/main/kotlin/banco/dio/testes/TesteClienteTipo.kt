package banco.dio.testes

import banco.dio.ClienteTipo

fun main() {
    ClienteTipo.values().forEach{ elemento -> println("${elemento.name} = ${elemento.descricao}")}

    ClienteTipo.values().forEach{ it:ClienteTipo -> println("${it.name} = ${it.descricao}")}

}