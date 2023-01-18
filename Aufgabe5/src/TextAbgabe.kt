fun main() {
    val fruechteListe: MutableList<String> = mutableListOf("Zitrone", "Banane", "Ananas", "Trauben")
    var lieblingsFrucht: String = "Erdbeere"

    for (i in 3 downTo 0) {
        if (fruechteListe[i] == "Banane") {
            lieblingsFrucht = "Banane"
        }
    }
    println(lieblingsFrucht)
}

/*
* Es besteht eine Liste mit Früchtenamen und einen String mit dem Inhalt "Erdbeere"
* Die angegebene For-Schleife startet am Ende der ersten Liste, jedoch mit einem festen Index 3
* Die For-Schleife endet mit dem Index 0 der auch noch verarbeitet wird (3..0)
* Falls die Banane in der Liste gefunden wird wird diese ausgegeben
 */