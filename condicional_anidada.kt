fun main() {
var sueldo:Float=0f
var antiguedad:Int=0
var aumento:Float=0f
var mensaje:String=""

println("ingrese su sueldo")
sueldo=readLine()!!.toFloat()
println("sueldo = $sueldo")

println("ingrese su antiguedad")
antiguedad=readLine()!!.toInt()
println("antiguedad = $antiguedad")

if(sueldo<500 && antiguedad>=10) {
    aumento = sueldo*0.2f
    sueldo += aumento
    mensaje="usted tiene un aumento del 20%, su sueldo queda en: $sueldo"
} else if(sueldo<500 && antiguedad<10) {
    aumento =sueldo*0.5f
    sueldo+=aumento
    mensaje="usted tiene un aumento del 5%, su sueldo queda en $sueldo"
} else {
    mensaje="usted no tiene ningun aumento, su sueldo es de: $sueldo"
}
println(mensaje)
}