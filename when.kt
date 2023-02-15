fun main() {
    var menu = """
    MENU DE OPCIONES
    1. saludar
    2. pedir el nombre de una persona
    3. sumar 2 numeros
    ingrese una opcion: 
    """

    print(menu)
    var opcion = readLine()?.toInt()
    when (opcion) {
        1 -> print("¡hola!")
        2 -> {print("ingrese su nombre: ")
        var name = readLine()
        println("hola, $name")}
        3 -> {
            print("ingrese el primer numero: ")
            var num1 = readLine()?.toInt()
            print("ingrese el segundo numero: ")
            var num2 = readLine()?.toInt()
            var sum = num1!!+num2!!
            print("la suma da: $sum")
        }
        else -> println("ingrese una opcion valida")
    }
} 