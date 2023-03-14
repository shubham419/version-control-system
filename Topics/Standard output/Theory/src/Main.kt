fun calculate(x: Int, y: Int, operation: (Int) -> Int = { x }) {
     operation(x)
}

fun sum(x: Int, y: Int) = x + y

fun square(x: Int): Int{
    return x * x
}

fun main() {
//     val sumResult = calculate(4, 5, ::sum)
    var valueFromFunction = 0
    val function: (a : Int) -> Int = { valueFromFunction = it
         it
    }
    val a = 4
    calculate(a, 5, function)

    val result = calculate(a, 4, :: square)

    println(" mulResult   $valueFromFunction")
}