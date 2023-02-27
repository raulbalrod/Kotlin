fun main() {
    var fib = 1
    var aux = 0
    
    println(fib)
    for(i in 0..10) {
        var result = fib + aux
        println(result)
        aux = fib
        fib = result 
    }
}
