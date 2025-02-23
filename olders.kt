class Person(val name: String, val age: Int) {
}

fun olders(array: Array<Person>){
    for (person in array){
        if (person.age >= 18){
            println(person.name)
        }
    }
}
    
fun main() {
    val persons = arrayOf(
        Person("Josef Stalin", 25),
        Person("René Higuita", 15),
        Person("Ana Frank", 17)
    )
    println("Personas mayores: ")
    olders(persons)  
}