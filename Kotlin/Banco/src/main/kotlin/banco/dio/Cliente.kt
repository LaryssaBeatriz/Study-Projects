package banco.dio

class Cliente(nome: String, cpf: String, val clienteTipo: String, val senha:String) : Pessoa(nome, cpf), Logavel{
        override fun Login(): Boolean = "123456" == senha

        override fun toString(): String = "" +
                " Nome: $nome" +
                " CPF: $cpf " +
                " Tipo: $clienteTipo" +
                " ".trimIndent()

}