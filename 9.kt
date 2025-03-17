//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Exercicio 9

    println("Digite o ano que você nasceu: ")

    var ano = readln().toInt()

    if(ano <= 2009){
        println("Você já poderá votar")
    }
    else if(ano > 2009){
        println("Você não poderá votar.")
    }

}