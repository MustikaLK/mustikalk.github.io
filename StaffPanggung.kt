package tugasInheritancePolymorphism

class StaffPanggung : Staff() {
    var tugas: String = ""

    fun ditugaskan() {
        println("Tugas saya yaitu $tugas")
    }

    override fun bekerjastaff() {
        println("Sebagai staff panggung saya bekerja dengan gaji $gaji")
    }
}