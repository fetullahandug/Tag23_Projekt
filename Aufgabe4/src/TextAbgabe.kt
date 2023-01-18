fun main() {
    val brands: List<String> = listOf("Samsung", "Apple", "PH", "Microsoft")
    for (i in 2..brands.size - 1) {
        println(brands[i])
    }
}

/*
* In einer Liste sind Markennamen gespeichert
* Die For-Schleife durcheght die Liste, der Anfang der Schleife ist auf den Index 2 gelegt das ENde auf das Listenende
* Die jeweiligen Listenelemente werden ausgegeben
 */