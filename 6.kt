//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
// Exercicio 6

    var media: Double
    var soma : Double

    print("Digite o primeiro número: ")
    var numeroUm = readln().toDouble()
    print("Digite o segundo número: ")
    var numeroDois = readln().toDouble()
    print("Digite o terceiro número: ")
    var numeroTres = readln().toDouble()
    print("Digite o quarto número: ")
    var numeroQuatro = readln().toDouble()

    println("O primeiro número é:  $numeroUm")
    println("O último número é:   $numeroQuatro")

    if (numeroUm > numeroDois && numeroUm > numeroTres && numeroUm > numeroQuatro){
        println("O maior número é: $numeroUm")
    } else if(numeroDois > numeroTres && numeroDois > numeroUm && numeroDois > numeroQuatro){
        println("O maior número é: $numeroDois")
    }else if (numeroTres > numeroDois && numeroTres > numeroUm && numeroTres > numeroQuatro){
        println("O maior número é: $numeroTres")
    }else{
        println("O maior número é: $numeroQuatro")
    }


}