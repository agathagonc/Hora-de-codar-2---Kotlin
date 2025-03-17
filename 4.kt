//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // Exercicio 4
    
    var maiorUm : Int
    var maiorDois : Int
    var soma : Int

    print("Digite o primeiro número: ")
    var numeroUm = readln().toInt()
    print("Digite o segundo número: ")
    var numeroDois = readln().toInt()
    print("Digite o terceiro número: ")
    var numeroTres = readln().toInt()

    if(numeroUm > numeroDois && numeroUm > numeroTres){
        maiorUm = numeroUm
        if(numeroDois < numeroTres){
            maiorDois = numeroTres
        }else{
            maiorDois = numeroDois
        }
    }else if(numeroDois > numeroTres && numeroDois > numeroUm){
        maiorUm = numeroDois
        if(numeroTres < numeroUm){
            maiorDois = numeroUm
        }else{
            maiorDois = numeroTres
        }
    }else{
        maiorUm = numeroTres
        if(numeroUm < numeroDois){
            maiorDois = numeroDois
        }else{
            maiorDois = numeroUm
        }
    }
    soma = maiorUm + maiorDois

    println("A soma dos dois maiores números é: $soma")
}