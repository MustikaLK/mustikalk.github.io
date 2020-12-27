package tugasInheritancePolymorphism

class Sutradara : Staff() {
    var tugas: String = ""

    fun ditugaskan() {
        println("Tugas saya yaitu $tugas")
    }

    override fun bekerjastaff() {
        println("Sebagai sutradara saya bekerja dengan gaji $gaji")
    }
}