package banco.dio

class Gerente(nome: String, cpf: String, salario: Double, val senha:String) : Funcionario(nome, cpf, salario), Logavel {

    override fun calculoAuxilio(): Double = salario * 0.4

    override fun Login():Boolean = "senha123" == senha

}