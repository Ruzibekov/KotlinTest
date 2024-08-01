import java.util.*
import kotlin.math.ceil

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
}/* chat jpt optimizatsiay qilgan varianti
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
//import kotlin.math.pow

/*fun masala14() {
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
 */
fun masala15() {
    val number = readln().split(' ').map { it.toInt() }
    if (number[0] == 0) {
        println(1)
    } else (println(number[1] + 1))
}

fun masala16() {
    val n = readln().toInt()
    val units = listOf("", "bir", "ikki", "uch", "to'rt", "besh", "olti", "yett", "sakkiz", "to'qqiz")
    val tens = listOf("", "o'n", "yigirma", "o'ttiz", "qirq", "ellik", "oltmish", "yetmish", "sakon", "to'qson")
    val hundred = listOf("", "yuz")
    val thousands = listOf("", "ming", "milion", "miliard")
    fun convertHundreds(number: Int): String {
        val h = number / 100
        val t = (number % 100) / 10
        val u = number % 10
        val result = StringBuilder()

        if (h > 0) result.append(hundred[h]).append(" ")
        if (t == 1) result.append("o'n ").append(units[u])
        else {
            if (t > 1) result.append(tens[t]).append(" ")
            if (u > 0) result.append(units[u])
        }

        return result.toString().trim()
    }

    // Функция для преобразования числа с учетом разрядов
    fun convert(number: Int): String {
        if (number == 0) return "nol"
        val result = StringBuilder()
        var num = number
        var scale = 0

        while (num > 0) {
            val chunk = num % 1000
            if (chunk > 0) {
                result.insert(0, convertHundreds(chunk) + " " + thousands[scale] + " ")
            }
            num /= 1000
            scale++
        }

        return result.toString().trim()
    }

    println(convert(n))
}

fun masla19() {
    val a = readln().split(' ').map { it.toInt() }
    println(a[1] / a[0])
}

fun masala20() {
    val a = readln().split(' ').map { it.toInt() }
    println(a[0] % a[1])
}

fun masala21() {
    val a = readln().split(' ').map { it.toDouble() }
    val sum = ceil((a[0] + a[1] + a[2]) / 2)
    println(sum.toInt())
}

fun masala22() {
    println(readln().toInt() / 10)
}

fun masala23() {
    println(readln().last())
}

fun masala24() {
    // Читаем и парсим первую строку
    val firstTime = readln().split(' ').map { it.toInt() }
    val firstHours = firstTime[0]
    val firstMinutes = firstTime[1]
    val firstSeconds = firstTime[2]
    val secondTime = readln().split(' ').map { it.toInt() }
    val secondHours = secondTime[0]
    val secondMinutes = secondTime[1]
    val secondSeconds = secondTime[2]
    val firstTotalSeconds = firstHours * 3600 + firstMinutes * 60 + firstSeconds
    val secondTotalSeconds = secondHours * 3600 + secondMinutes * 60 + secondSeconds
    val differenceInSeconds = secondTotalSeconds - firstTotalSeconds
    println(differenceInSeconds)
}

fun masala25() {
    val diffirenceInSeconds = readln().toInt()
    val hour = diffirenceInSeconds / 3600
    val minut = (diffirenceInSeconds % 3600) / 60
    val seconds = diffirenceInSeconds % 60
    when {
        seconds < 10 && seconds >= 0 && minut < 10 && minut >= 0 -> {
            println("$hour:0$minut:0$seconds")
        }

        seconds < 10 && seconds >= 0 -> {
            println("$hour:$minut:0$seconds")
        }

        minut < 10 && minut >= 0 -> {
            println("$hour:0$minut:$seconds")
        }
    }

}

fun masala25N2() {
    val differenceInSeconds = readln().toInt()
    val hours = differenceInSeconds / 3600
    val minutes = (differenceInSeconds % 3600) / 60
    val seconds = differenceInSeconds % 60

    val formattedMinutes = if (minutes < 10) "0$minutes" else "$minutes"
    val formattedSeconds = if (seconds < 10) "0$seconds" else "$seconds"

    println("$hours:$formattedMinutes:$formattedSeconds")
}

fun masala26() {
    val a = readln().toInt()
    val b = readln()
    val c = readln().toInt()
    when {
        b == "/" -> {
            println(a / c)
        }

        b == "*" -> {
            println(a * c)
        }

        b == "-" -> {
            println(a - c)
        }

        b == "+" -> {
            println(a + c)
        }
    }
}


fun main() {
    val scan = Scanner(System.`in`)

    val num1 = scan.nextInt()
    val char = scan.next()
    val num2 = scan.nextInt()

    val result = when (char) {
        "/" -> num1 / num2
        "*" -> num1 * num2
        "+" -> num1 + num2
        "-" -> num1 - num2
        else -> 0
    }

    println(result)
}
