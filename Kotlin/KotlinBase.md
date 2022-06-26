[◄ back](../README.md)

# KOTLIN

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

tabela

Função Expressão Comando Atribuição

Soma a+b a.plus(b) a += b
Subtração a-b a.minus(b) a -= b
Multip a _b a.times(b) a _= b
divisão a/b a.div(b) a/=b
resto a%b a.mod(b) a%=b

## Operadores comparativos

Função Expressão Comando
Maior/Menor a>b ou a<b a.compareTo(b)>0 ou a.compareTo(b) < 0
Mai/men igual a>=b ou a<=b a.compareTo(b)>=0 ou a.compareTo(b)<=0
Igual a == b a.equals(b)
Diferente a!= b !(a.equals(b))

Obs: os comandos compareTo retornam valores **-1 para menor que**, **0 para igual** e **1 para maior que**, o trecho de código que compara o compareTo a um valor (0 na tabela) faz o comando retornar um boleano.

Obs2.: Operadores e equals retornam booleano

## Operadores lógicos

-> retornam booleano

Função e expressão Comando

E (&&) (expressao 1) and (expressao 2)
OU (||) (expressao 1) or (expressao 2)

## Operadores **In** e **Range**

Função e expressão

- contém (In)
- não contém (!in)
- range/ faixa de valores

exemplo:

```
val numbers = listOf (3,9,0,1,2)
print(12 in numbers)
```

exemplo 2:

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

-> isBlank() e isEmpty()

**Empty** se refere a toda a String cujo **tamanho é igual a zero**. **Blank** se refere a uma String cujo o **conteúdo são apenas espaços em branco**.

- Strings vazias estão em branco, logo se isEmpty é verdadeiro, isBlank é verdadeiro também 
- Esses métodos são utilizados principalmente em inputs do usuário 

[▲ top](#kotlin)
