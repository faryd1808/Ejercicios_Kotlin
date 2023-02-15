fun main() {
    println ("ingrese el valor de su compra: ")
    var valorCompra = readLine()!!. toDouble()
    println ("el valor de,la compra es: $valorCompra")

    var descuento = 0.0

    if (valorCompra >= 100000) {
        descuento = valorCompra * 0.5
        valorCompra -= descuento
        println ("se aplico el descuento del 50% equivalente a: $descuento")
    }else{
        descuento = valorCompra * 0.1
        valorCompra -= descuento
        println("se aplico un descuento del 10% equivalente a: $descuento")
    }

    println("valor final: $valorCompra")
} 