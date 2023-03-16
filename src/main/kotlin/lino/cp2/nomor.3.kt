package lino.cp2

fun main() {
    val sentenceWithDoubleQuotes = "ini saya \" lino \" laki-laki kharismatik dengan gaya tarik kuat"
    val senteceWithSingleQuotes = sentenceWithDoubleQuotes.replace("\"","''")
    println(senteceWithSingleQuotes)
}