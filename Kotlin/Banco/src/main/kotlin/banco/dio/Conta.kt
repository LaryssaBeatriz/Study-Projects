package banco.dio

import java.math.BigDecimal

class Conta ( val agencia: String, val numeroConta:String, val saldo: BigDecimal) {
    fun deposito(valor: BigDecimal){
    }

    fun saque(valor: BigDecimal){
    }
}