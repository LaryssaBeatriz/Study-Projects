package banco.dio.testes

import banco.dio.Funcionario

class ImprimeRelatorio{
    /* método estático onde eu consigo invocá-lo via metódo, não instancia */
    companion object {
        fun imprime(funcionario: Funcionario) = println(funcionario.toString())
    }
}