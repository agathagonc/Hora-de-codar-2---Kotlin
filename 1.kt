//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


   // Exercicio 1

print("Digite o primeiro número: ")
var numeroUm = readln().toInt()
    
print("Digite o segundo número: ")
var numeroDois = readln().toInt()

if(numeroUm < numeroDois){
    print("O maior número é: $numeroDois")
}else if(numeroUm > numeroDois){
    print("O maior número é: $numeroUm")
}else{
    println("Os números são iguais!")
}
}