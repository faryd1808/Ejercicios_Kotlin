fun main() {
    print("ingrese el numero de personas a saludar: ")
    val cantPer = readLine()!!.toInt()
    var contador = 1

    do {
        print("ingrese el nombre de la persona $contador: ")
        val nombre = readLine()!!
        println("hola $nombre, bienvenido")
        contador++
    } while (contador <= cantPer)
}