fun main() {
    print("masukkan angka: ")
    val nilai = readLine()!!.toInt()

    var nilai2 = true
    for (i in 2 until nilai/2) {
        if (nilai % i == 0) {
            nilai2 = false
            break
        }
    }

    if (nilai == 1) {
        print("Bukan bilangan prima")
    } else if (nilai2) {
        print("Bilangan prima")
    } else {
        print("Bukan bilangan prima")
    }
}