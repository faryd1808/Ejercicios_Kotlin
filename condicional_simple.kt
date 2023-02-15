fun main() {
    println("digite el numero: ")
    var num = readLine()!!.toInt()

    if (num < 0) {
        num *= -1
    }

    println("el valor absoluto del numero ingresado es: $num")
} 