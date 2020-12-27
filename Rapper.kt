package tugasInheritancePolymorphism

class Rapper : Penampil() {
    var genre: String = ""

    fun rap() {
        println("Saya merupakan rapper dengan genre $genre")
    }

    override fun bekerjapenampil() {
        println("Sebagai rapper saya bekerja dengan gaji $gaji")
    }
}