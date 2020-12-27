package tugasInheritancePolymorphism

fun main() {

    val shannon = Penyanyi()
    shannon.nama = "Shannon Williams"
    shannon.perusahaan = "MBK Entertainment"
    shannon.perkenalan()
    shannon.gaji = 40000000
    shannon.bekerjapenampil()
    shannon.genre = "Pop"
    shannon.menyanyi()

    println("----------------------------------------------------------------------------------------------------")

    val karina = Penari()
    karina.nama = "Karina Yoo"
    karina.perusahaan = "SM Entertainment"
    karina.perkenalan()
    karina.gaji = 60000000
    karina.bekerjapenampil()
    karina.genre = "Modern"
    karina.menari()

    println("----------------------------------------------------------------------------------------------------")

    val bobby = Rapper()
    bobby.nama = "Bobby Kim"
    bobby.perusahaan = "YG Entertainment"
    bobby.perkenalan()
    bobby.gaji = 90000000
    bobby.bekerjapenampil()
    bobby.genre = "Hip Hop Soul"
    bobby.rap()

    println("----------------------------------------------------------------------------------------------------")

    val irene = MUA()
    irene.nama = "Irene Kim"
    irene.alamat = "Jakarta Pusat"
    irene.notlp = "+628-123-456-789"
    irene.perkenalanstaff()
    irene.gaji = 20000000
    irene.bekerjastaff()
    irene.ruangtunggu = "Penyanyi"
    irene.mendandani()

    println("----------------------------------------------------------------------------------------------------")

    val jeremy = OB()
    jeremy.nama = "Jeremy Castle"
    jeremy.alamat = "Jakarta Timur"
    jeremy.notlp = "+628-234-567-890"
    jeremy.perkenalanstaff()
    jeremy.gaji = 7000000
    jeremy.bekerjastaff()
    jeremy.tugas = "membersihkan properti"
    jeremy.ditugaskan()

    println("----------------------------------------------------------------------------------------------------")

    val jacob = Sutradara()
    jacob.nama = "Jacob Scott"
    jacob.alamat = "Jakarta Barat"
    jacob.notlp = "+628-345-678-901"
    jacob.perkenalanstaff()
    jacob.gaji = 650000000
    jacob.bekerjastaff()
    jacob.tugas = "memimpin jalannya acara"
    jacob.ditugaskan()

    println("----------------------------------------------------------------------------------------------------")

    val steven = StaffPanggung()
    steven.nama = "Steven Bay"
    steven.alamat = "Bandung"
    steven.notlp = "+628-456-789-012"
    steven.perkenalanstaff()
    steven.gaji = 50000000
    steven.bekerjastaff()
    steven.tugas = "mengatur segala keperluan berkaitan dengan panggung"
    steven.ditugaskan()

    println("----------------------------------------------------------------------------------------------------")

    val allen = Penggemar()
    allen.nama = "Allen Lee"
    allen.notlp = "+628-567-890-123"
    allen.perkenalanpenggemar()
    allen.idola = "penari Karina Yoo"
    allen.mengidolakan()

}