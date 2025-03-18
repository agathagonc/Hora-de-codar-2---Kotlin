//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
// Exercicio 11

    print("Informe o primeiro valor: ")

    val valor1 = readLine()?.toIntOrNull()

    print("Informe o segundo valor: ")

    val valor2 = readLine()?.toIntOrNull()

    print("Informe a operação (1: Adição, 2: Subtração, 3: Divisão, 4: Multiplicação): ")
    
    val operacao = readLine()?.toIntOrNull()

    if (valor1 != null && valor2 != null && operacao != null) {
        val resultado = when (operacao) {
            1 -> valor1 + valor2
            2 -> valor1 - valor2
            3 -> if (valor2 != 0) valor1 / valor2 else {
                println("Erro: Divisão por zero não é permitida.")
                return
            }
            4 -> valor1 * valor2
            else -> {
                println("Operação inválida.")
                return
            }
        }
        println("O resultado da operação é $resultado")
    } else {
        println("Valores ou operação inválidos.")
    }
}