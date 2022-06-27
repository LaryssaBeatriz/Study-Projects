# KOTLIN

[◄ back](../README.md)

## Introdução

var - variável comum, dado que pode ser modificado ao longo do código e da execução

val - "variável" é imutável, recebe valor mas não pode ser reatribuído ao longo do código

const val - é uma constante que só pode ser acessada, não reconhecida quando declarada em função - é de caráter global - e é atribuído durante a compilação

-> declaração de variável com tipagem explícita e seguida de interrogação indica que a variável pode receber valor nulo

Exemplo:

```
var phrase:String? = null
// a variável pode ser nula ou um String
var idade:Int? = null
// a variável pode ser nula ou um Int
```

## Operadores Aritméticos

![Tabela dos Operadores Aritméticos](./Images/TabelaOpAritmeticos.png)

## Operadores comparativos

![Tabela dos Operadores Aritméticos](./Images/TabelaOpComparativos.png)

Obs: os comandos compareTo retornam valores **-1 para menor que**, **0 para igual** e **1 para maior que**, o trecho de código que compara o compareTo a um valor (0 na tabela) faz o comando retornar um boleano.

Obs2.: Operadores e equals retornam booleano

## Operadores lógicos

-> retornam booleano

![Tabela dos Operadores Aritméticos](./Images/TabelaOpLogicos.png)

## Operadores **In** e **Range**

Função e expressão

- contém (In)
- não contém (!in)
- range/ faixa de valores

Exemplo 1:

```
val numbers = listOf (3,9,0,1,2)
print(12 in numbers)
```

Exemplo 2:

```
	const val MIN_AGE = 16
	const val MAX_AGE = 68
	//main
	fun main(){
		var age (10..100).random()
		println(age)
		println(age in MIN_AGE..MAX_AGE) // os .. são o simbolo para indicar a faixa de valores a ser analisado
	}
```

## Funções Empty e Blank

`isBlank()` e `isEmpty()`

**Empty** se refere a toda a String cujo **tamanho é igual a zero**. **Blank** se refere a uma String cujo o **conteúdo são apenas espaços em branco**.

- Strings vazias estão em branco, logo se isEmpty é verdadeiro, isBlank é verdadeiro também
- Esses métodos são utilizados principalmente em inputs do usuário

## Funções

Uma função é definida por `Fun nomeDaFunção(nome:Tipo):TipoRetorno{}`, quando a função for void basta apenas ocultar o TipoRetorno

### Funções de ordem superior

São funções que não precisam de objeto ou classe para serem chaamdas. Recebem outra função ou lambda por parametro (lambda seria aquelas funções que possuem uma seta e que representam um bloco de função). São úteis para a generaliação de funções e tratamentos de erros, que permite que a função possa ser reutilizada mais facilmente, seja testada e também mais segura.

```
fun main() {

    val z:Int
    // 34 é equivalente ao n1, 90 é equivalente ao n2 e o sum indica a operação que a função vai fazer
	z = calculate(34,90,::sum)

    println(z)

}

fun sum(a1:Int, a2:Int) = a1.plus(a2)

// Nesse caso, os valores que são passados por parâmetro ao chamar a função, vão ser os mesmo executados pela operação
fun calculate(n1:Int, n2:Int, operation:(Int,Int) -> Int): Int{
    val result = operation(n1,n2)
    return result
}
```

[▲ top](#kotlin)
