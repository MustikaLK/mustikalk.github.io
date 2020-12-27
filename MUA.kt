package tugasInheritancePolymorphism

import java.math.BigInteger

class MUA : Staff() {
    var ruangtunggu: String = ""

    fun mendandani() {
        println("Saya merupakan MUA di ruang tunggu $ruangtunggu")
    }

    override fun bekerjastaff() {
        println("Sebagai staff MUA saya bekerja dengan gaji $gaji")
    }
}