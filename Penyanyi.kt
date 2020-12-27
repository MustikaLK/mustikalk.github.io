package tugasInheritancePolymorphism

class Penyanyi : Penampil() {
    var genre: String = ""

    fun menyanyi() {
        println("Saya merupakan penyanyi dengan genre $genre")
    }

    override fun bekerjapenampil() {
        println("Sebagai penyanyi saya bekerja dengan gaji $gaji")
    }
}