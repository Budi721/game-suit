fun main() {
    val options = arrayOf("batu", "kertas", "gunting")
    var player1: String
    var player2: String

    println("==========================")
    println("GAME SUIT TERMINAL VERSION")
    println("==========================")

    while (true) {
        println("1. Masukkan pemain 1:")
        player1 = readln().lowercase()
        if (options.contains(player1)) {
            break
        }
    }

    while (true) {
        println("2. Masukkan pemain 2:")
        player2 = readln().lowercase()
        if (options.contains(player2)) {
            break
        }
    }

    if (player1 == "gunting" && player2 == "kertas") {
        println("Pemain 1 MENANG!")
    } else if (player2 == "gunting" && player1 == "kertas") {
        println("Pemain 2 MENANG!")
    } else if (player1 == "batu" && player2 == "kertas") {
        println("Pemain 2 MENANG!")
    } else if (player2 == "batu" && player1 == "kertas") {
        println("Pemain 1 MENANG!")
    } else if (player1 == "batu" && player2 == "gunting") {
        println("Pemain 1 MENANG!")
    } else if (player2 == "batu" && player1 == "gunting") {
        println("Pemain 2 MENANG!")
    } else {
        println("DRAW!")
    }
}