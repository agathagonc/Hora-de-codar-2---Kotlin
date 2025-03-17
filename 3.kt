//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   //Exercicio 3

    print("Digite o primeiro número: ")

    var numeroUm = readln().toInt()

    print("Digite o segundo número: ")
    var numeroDois = readln().toInt()
    
    print("Digite o terceiro número: ")
    var numeroTres = readln().toInt()

    if(numeroUm > numeroDois && numeroUm > numeroTres){
        print("O maior número é: $numeroUm")
    }else if(numeroDois > numeroTres && numeroDois > numeroUm){
        print("O maior número é: $numeroDois")
    }else{
        println("O maior número é: $numeroTres")
    }
}