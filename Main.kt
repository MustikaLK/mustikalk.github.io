fun main() {

    val mustika : Human = Human("Mustika Lutfiani")
    val andi : Human = Human("Andi")

    mustika.email = "mustika@gmail.com"
    mustika.address = "Jeruklegi, Cilacap"

    andi.email = "andi@gmail.com"
    andi.address = "Kotagede, Yogyakarta"

    mustika.talk()
    andi.talk()

    mustika.introduce()

    println(mustika.verify("mustika@gmail.com"))

    println(Rahardi.name)

    val ardi : Rahardi = Rahardi
    println(ardi.nasionality)

    println(mustika)
}