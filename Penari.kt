package tugasInheritancePolymorphism

class Penari : Penampil() {
    var genre: String = ""

    fun menari() {
        println("Saya merupakan penari dengan genre $genre")
    }

    override fun bekerjapenampil() {
        println("Sebagai penari saya bekerja dengan gaji $gaji")
    }
}