fun main() {
    val numeroUno = 15
    val numeroDos = 5
    val resultado = numeroUno > numeroDos
    println("¿El número uno es mayor que el número dos? ${resultado.toSiNo()}")

    val numero = 30
    val divisor = 5
    println("¿El número $numero es divisible por $divisor? ${numero.esDivisiblePor(divisor).toSiNo()}")

    val listaNumeros = listOf(1, 2, 3, 4, 5)
    println("La suma de los elementos de la lista es: ${listaNumeros.sumarElementos()}")

    val cadena = "Kotlin"
    println("La cadena invertida es: ${cadena.invertir()}")

    val numeroDecimal = 12.75
    println("El número $numeroDecimal redondeado es: ${numeroDecimal.redondear()}")
}


fun Boolean.toSiNo(): String {
    return if (this) "SI" else "NO"
}


fun Int.esDivisiblePor(divisor: Int): Boolean {
    return this % divisor == 0
}


fun List<Int>.sumarElementos(): Int {
    var suma = 0
    for (elemento in this) {
        suma += elemento
    }
    return suma
}


fun String.invertir(): String {
    var cadenaInvertida = ""
    for (i in this.length - 1 downTo 0) {
        cadenaInvertida += this[i]
    }
    return cadenaInvertida
}


fun Double.redondear(): Int {
    val entero = this.toInt()
    val decimal = this - entero
    return if (decimal >= 0.50) entero + 1 else entero
}


