package lino.cp2

fun test(){
    println("masukan angka: ")
    var case = 0
    val a = readLine()?.toInt() ?: 0
    val b = readLine()?.toInt() ?: 0
    val ganjil = mutableListOf<Int>()

    for (i in a..b) {
        if (i%2 == 1 ){
            ganjil.add(i)
        }
    }
    println("nilai ganjil dalam range $a..$b adalah $ganjil")
    val hasil = ganjil.sum()
    case++

    println("case $case: $hasil")
}

fun main(){


    println(test())
    println(test())

}