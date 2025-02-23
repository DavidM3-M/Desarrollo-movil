fun calculateAverage(list: List<Double>): Double {
    if (list.isEmpty()) {
        throw IllegalArgumentException("la lista requiere de almenos un número")
    }
    return list.average()
}
fun main() {
    val numbers = listOf(4.0,2.0,4.5)
    val prom = calculateAverage(numbers)
    println("El promedio es: $prom")
}
