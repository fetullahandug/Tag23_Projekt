fun main() {
    val books: List<String> = listOf("Harry Potter", "Herr der Ringe", "Dune", "Eragon")
    for(i in 0..books.size-1) {
        val book = books[i]
        println("Das Buch an der Stelle $i ist $book.")
    }
    println("Das waren alle Buecher")
}

/*
* Es wird eine Liste angeleget, diese enthaltet Filmnamen
* Die Liste wird durch einen Index durchlaufen
* Der aktuelle Index(Wert) wird in einer Zwischenvariable angelegt und vermerkt
* Nun wird die Stelle und der Name des Buches ausgegeben
* Am Ende, nach Ende der Schleife wird das Ende durch eine Textausgabe geprintet
*/