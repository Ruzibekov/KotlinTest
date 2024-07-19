fun masala1() {
    val num = readln().split(' ').map { it.toInt() }
    println(num[0] + num[1])
}

fun masala2() {
    val number = readln().split(' ').map { it.toInt() }
    when {
        number[0] > number[1] -> println(">")
        number[0] < number[1] -> println("<")
        number[0] == number[1] -> println("=")
    }
}

fun masala3() {
    println(Array(2) { readln().toInt() }.let { it[0] + it[1] })
}

fun masala4() {
    val number = readln().split(' ').map { it.toInt() }
    println(number[0] * number[1])
}

fun masala6() {

    val year = readln().toInt()
    when {
        year % 400 == 0 -> println("12/09/$year")
        year % 4 == 0 && year % 100 != 0 -> println("13/09/$year")
        year < 10 -> println("13/09/000$year")
        year < 100 -> println("13/09/00$year")
        year < 1000 -> println("13/09/0$year")
        else -> println("13/09/$year ")
    }
}
/* chat jpt optimizatsiay qilgan varianti
 val year = readln().toInt()

// Определяем, является ли год високосным
val isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)
val programmersDay = if (isLeapYear) "12/09/$year" else "13/09/$year"

// Форматируем год до 4 цифр
val formattedYear = year.toString().padStart(4, '0')

// Выводим дату дня программиста
println(programmersDay.replace("$year", formattedYear))
 */


fun masala7() {

    val numbers = readln().split(' ').map { it.toInt() }
    numbers.sorted()
    val minsum = numbers.take(4).sum()
    val maxsum = numbers.takeLast(4).sum()
    print("$minsum $maxsum ")
}

fun masala9() {
    val number = readln().toInt()
    val elements = readln().split(" ").map { it.toInt() }
    var uniqueelemnt = 0
    var uniqueNumber = 0
    for (element in elements) {
        uniqueNumber = uniqueNumber xor element
    }
    println(uniqueNumber)
}

fun masala10() {

    val summa = readln().toInt()
    val sistersmoney = readln().split(' ').map { it.toInt() }
    if (sistersmoney[0] + sistersmoney[1] + sistersmoney[2] >= summa) {
        println("YES")
    } else (println("NO"))
}

fun masala11() {


    val number = readln().toInt()
    val elements = readln().split(' ').map { it.toInt() }
    var maxIndex1 = 0
    var maxIndex2 = 0
    for (i in elements.indices) {
        if (maxIndex1 == 0 || elements[i] > elements[maxIndex1]) {
            maxIndex1 = i
        }
    }
    for (i in elements.indices) {
        if (i == maxIndex1) continue
        if (maxIndex2 == 0 || elements[i] > elements[maxIndex2]) {
            maxIndex2 = i
        }
    }
    println(elements[maxIndex2])
}

fun masala13() {
    val number = readln().split(' ').map { it.toInt() }
    if (number[0] == 0) {
        println(1)
    } else (println(number[1] + 1))
}
import kotlin.math.pow

fun masala14() {
    val number = readln().split(' ').map { it.toInt() }
    val n = number[0]
    val k = number[1]
    val result = if (n == 0) {
        1
    } else {
        ((1 + k).toDouble().pow(n.toDouble())).toLong()
    }
    println(result)
}

fun main() {
    masala14()
}