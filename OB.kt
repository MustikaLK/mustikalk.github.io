package tugasInheritancePolymorphism

class OB : Staff() {
    var tugas: String = ""

    fun ditugaskan() {
        println("Tugas saya yaitu $tugas")
    }

    override fun bekerjastaff() {
        println("Sebagai staff OB saya bekerja dengan gaji $gaji")
    }
}