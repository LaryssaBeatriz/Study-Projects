package banco.dio.testes

import banco.dio.Banco

fun main(){
    val bancoOO = Banco( nome ="Banco OO", numero= 12)

    println(bancoOO.nome)
    println(bancoOO.numero)
}
