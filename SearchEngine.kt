package search

fun main() {
    val inputData = inputData()

    println("=== Menu ===\n" +
            "1. Find a person\n" +
            "2. Print all people\n" +
            "0. Exit"
    )

    while (true) {
        when (readln()) {
            "1" -> findAPerson(inputData)
            "2" -> printAllPeople(inputData)
            "0" -> return
            else -> println("Incorrect option! Try again.")
        }
    }
}

fun inputData(): MutableList<String> {
    val arrayOfStrings = mutableListOf<String>()

    println("Enter the number of people:")
    val countOfItems = readln().toInt()

    repeat(countOfItems) {
        arrayOfStrings.add(readln())
    }

    return arrayOfStrings
}

fun findAPerson(inputData: MutableList<String>) {
    println("Enter data to search people:")
    val query = readln()
    val foundPeople = mutableListOf<String>()

    for (i in inputData) {
        if (i.lowercase().contains(query.lowercase())) {
            foundPeople.add(i)
        }
    }

    if (foundPeople.size > 0) {
        println("People found:")
        println(foundPeople.joinToString("\n"))
    } else {
        println("No matching people found.")
    }
}

fun printAllPeople(inputData: MutableList<String>) {
    println(inputData.joinToString("\n"))
}
