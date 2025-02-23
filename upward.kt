fun printIfUpward(list: List<Int>) {
    if (list == list.sorted()) {
        println("Lista ordenada: $list")
    } else {
        println("La lista no está en forma ascendente")
    }
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    printIfUpward(numbers)

    val numbersTwo = listOf(5, 3, 1, 2, 4)
    printIfUpward(numbersTwo)
}