package tugasInheritancePolymorphism

class Penggemar {
    var nama: String = ""
    var notlp: String = ""

    var nik: Int = 0
    var idola: String = ""

    fun perkenalanpenggemar() {
        println("Halo, nama saya $nama dan nomor telepon saya $notlp")
    }

    fun mengidolakan() {
        println("Saya sebagai penggemar mengidolakan $idola")
    }
}