fun main() {
    resumido()
}

  // - Resumido
fun resumido() {
    val numeros = listOf(1, 8, 9, 24, 98, 63, 42, 78, 37, 2, 101, 548)
    val mayorNumeroImpar = numeros.filter { it %  2 != 0 }
    println(mayorNumeroImpar.maxOrNull())
}

fun normal() {
    // val numeros = arrayOf(1, 8, 9, 24, 98, 63, 42, 78, 37, 2, 101, 548)
    // val numeros = arrayOf(-2, -3, -4)
    val numeros = listOf(-2, -3, -4)
    val max: Int = list.maxOrNull() ?: 0
  
    var numeroImparMayor = numeros.get(0)
    for (i in numeros) {
      if (numeros.get(i) % 2 != 0 && numeroImparMayor < numeros.get(i)) {
        numeroImparMayor = numeros.get(i)
      }
    }
  
    println(numeroImparMayor)
}