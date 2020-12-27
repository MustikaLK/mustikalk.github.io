package tugasInheritancePolymorphism

open class Penampil {
    var nama: String = ""
    var perusahaan: String = ""

    var idpenampil: String = ""
    var gaji: Int = 0

    fun perkenalan() {
        println("Halo, nama saya $nama, saya berasal dari perusahaan $perusahaan")
    }

    open fun bekerjapenampil() {
        println("Saya sebagai penampil bekerja dengan gaji $gaji")
    }
}