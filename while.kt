fun main() {
    var respuesta = "si"
    var contador = 0

    while (respuesta == "si") {
        print ("ingrese su nombre: ")
        val nombre = readLine()!!

        print("hola $nombre bienvenido a la clase\n")
        contador++

        print("ingrese si, si hay mas personas: ")
        respuesta = readLine()!!
    }

    println("llegaron $contador personas")
    println("fin del programa")
}