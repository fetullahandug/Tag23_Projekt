fun main() {
    val speedLimits: List<Int> = listOf(30, 50, 80, 100, 120)
    for (i in 0..speedLimits.size - 1) {
        if (speedLimits[i] == 30) {
            println("auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.")
        } else if (speedLimits[i] == 80) {
            println("auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.")
        } else if (speedLimits[i] == 120) {
            println("auf der " + i + ". Strasse kann man " + speedLimits[i] + "km/h fahren.")
        }
    }
}

/*
* Eine Liste mit Geschwindigkeitsbegrenzungsangaben besteht
* Die Liste wird durch die For-Schleife beginnend mit dem Index 0 bis Ende der Liste (Listengröße-1) durchlaufen
* Es werden Infotexte zu den jeweiligen Speedlimits ausgegeben
* Es wird nicht zu jedem Tempolimit etwas ausgegeben
 */