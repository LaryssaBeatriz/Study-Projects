package banco.dio.testes

import banco.dio.Cliente

fun main() {
    val jorge = Cliente("Jorge","44444444444","Pessoa Física", "1234")

    println(jorge)

    TesteAutenticacao().autentica(jorge)
}
