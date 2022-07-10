package banco.dio.testes

import banco.dio.Gerente

fun main(){

    val beatriz = Gerente("Beatriz","2222222222",5000.0, "senha123")

    ImprimeRelatorio.imprime(beatriz)

    TesteAutenticacao().autentica(beatriz)

}
