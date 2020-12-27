package tugasInheritancePolymorphism

open class Staff {
    var nama: String = ""
    var alamat: String = ""
    var notlp: String = ""

    var idstaff: String = ""
    var gaji: Int = 0

    fun perkenalanstaff() {
        println("Halo, nama saya $nama, alamat saya di $alamat, dan nomor telepon saya $notlp")
    }

    open fun bekerjastaff() {
        println("Saya bekerja sebagai staff dengan gaji $gaji")
    }
}