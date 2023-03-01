import java.util.Scanner
import kotlin.random.Random
 
fun main() {
    val scanner = Scanner(System.in)
    val stone = 1
    val paper = 2
    val sicsor = 3
    val maquina = (1..3).random()
    //
    println("Selection machine: " + maquina)

    println("Choose a data")

    var eleccion = scanner.nextInt()

    if(eleccion == stone && maquina == 1  eleccion == paper && maquina == 2  eleccion ==       sicsor && maquina == 3){
        println("Tie")
    }else if(eleccion == stone && maquina == 3  eleccion == paper && maquina == 1 
        eleccion == sicsor && maquina == 2){
        println("Lose the machine")
    }else{
      println("Lose the player")
    }

    scanner.close()
}