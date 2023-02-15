fun main() {
    print("ingrese la cantidad de veces que debe de repetir:")
    val repetir = readLine()!!.toInt()

    for (i in 0 until repetir) {
        print("ingrese el primer numero: ")
        val x = readLine()!!.toInt()

        print("ingrese el segundo numero: ")
        val y = readLine()!!.toInt()

        val suma = x + y
        print("la suma es: $suma")
        
        when {
            suma >= 10 -> println("la suma es mayor o igual a dos digitos y es positivo")
            suma <= 0 -> {
                println("la suma es un valor negativo")
                if(suma <= -10) {
                    println("la suma es un numero negativo de dos digitos")
                } else {
                    println("la suma es un valor negativo de un digito")
                }
            }
            else -> println("la suma es un valor positivo de un digito")
        }
    }
} 