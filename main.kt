
fun main(){

  println ("Questão")
  println ("Faça um programa que soma a quantidade de alunos que gostam de física e química ")

  var salaA:Int 
  var salaB:Int 
  var salaC:Int 
  var salaD:Int 
  var soma:Int 

  salaA = 15
  salaB = 10
  salaC = 12
  salaD = 14

  soma = salaA + salaB + salaC + salaD 

  println (soma)
} 


// 2. Faça um programa que calcule a média de três notas e exibe o resultado no console.
fun media(){

  var nota1 = 10 
  var nota2 = 7.0 
  var nota3 = 6.0 

  var media = (nota1 + nota2 + nota3)/3

  println("Sua média:$media")

  if (media>= 7.0) {
    println("parabéns, você passou")
  } else if(media>= 4.0){
    print("Faça a Avaliação/Prova Final!")
  }else {
    print("Que pena, você não passou.... Nos vemos no próximo ano!")
  }
}


//3. Faça um programa que calcula e mostra o salário de um funcionário que teve um aumento de 25%.

fun aumentaSalario (){
  println("Digite seu salario:")
  var salario = readLine()!!.toDouble()
  var aumento = salario*0.25 
  println(salario + aumento)
  
}

//4. Faça um programa que calcula a área de um triângulo. Sabe-se que: Área = (base * altura) / 2 

fun áreatriângulo (){
var base : Int = 5
var altura : Int = 6
var area = (base * altura)/ 2  
println ("calcula a área de um triângulo que é igual a $area") 

}


