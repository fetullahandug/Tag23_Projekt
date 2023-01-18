fun main() {
    val guests = listOf<String>("Paul", "Keanu", "Michael", "Hans", "Lukas", "Marko")
    for (i in 0..guests.size - 1) {
        if (guests[i] == "Lukas") {
            println("Hey Lukas kommt!")
        }
        if (guests[i] == "Keanu") {
            println("Oh cool, Keanu is auch dabei!")
        }
        if (guests[i] == "Michael") {
            println("Wie es Michael wohl geht?")
        }
    }
}

/*
* Eine Liste mit Gästenamen exisitert
* Die Gästeliste wird durchlaufen (von 0 bis Ende der Liste)
* Es werden verschieden Texte zu den jeweiligen Gästen ausgegeben
* Um genau zu sein für Lukas, Keanu und Michael
 */