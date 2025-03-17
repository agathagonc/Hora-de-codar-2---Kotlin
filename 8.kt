//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Exercicio 8

    println("Digite a primeira nota: ")
    var n1 = readln().toInt()

    println("Digite a segunda nota: ")
    var n2 = readln().toInt()

    println("Digite a terceira nota: ")
    var n3 = readln().toInt()

    println("Digite a quarta nota: ")
    var n4 = readln().toInt()

    var media = (n1 + n2 + n3 + n4)/4

    if(media > 5){
        println("Você passou no teste!")
    }
    else{
        println("Tente novamente.")
    }

}