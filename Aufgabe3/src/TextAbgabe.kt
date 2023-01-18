fun main() {
    val weekDays: List<String> = listOf(
        "Montag", "Dienstag", "Mittwoch",
        "Donnerstag", "Freitag", "Samstag", "Sonntag"
    )
    for (day in weekDays) {
        if (day == "Samstag" || day == "Sonntag") {
            println("am $day hab ich frei.");
        } else {
            println("am $day muss ich arbeiten.");
        }
    }
}

/*
* In einer Liste sind alle Wochentage vermerkt
* Die For-Schleife durcheght die Liste mit dem Iterator "day"
* Die For-Schleife überprüft jeden einzelnen Tag (jedes Lsitenelement)
* Für die Tage des Wochenende wird ein besonderer Text ausgegeben (frei)
* Für die Werktage auch (arbeiten)
*
 */