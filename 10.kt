//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   // Exercicio 10

    print("Informe sua altura (em metros): ")
    
    val altura = readLine()?.toDoubleOrNull()

    print("Informe seu gênero designado ao nascer (1: feminino, 2: masculino): ")
    val genero = readLine()?.toIntOrNull()

    if (altura != null && genero != null) {
        val pesoIdeal = when (genero) {
            1 -> (62.1 * altura) - 44.7
            2 -> (72.7 * altura) - 58
            else -> {
                println("Gênero inválido.")
                return
            }
        }
        println("Seu peso ideal é $pesoIdeal kg")
    } else {
        println("Valores inválidos.")
    }
}