fun main() {
    val str = "hola mundo! convirtiendo en mayus la primera letra."
    val mayusc = str.split(" ").map { it.capitalize() }
    
    print(mayusc.joinToString(" "))
}