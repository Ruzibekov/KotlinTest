fun main() {
    /* 1. Muallif: Sunatullo Hojiyev, Xotira: 16 MB, Vaqt: 1000 ms , Qiyinchiligi: 1 %
     Masala
     A va B butun sonlari yig'indisini hisoblash kerak bo'ladi
             Kiruvchi ma'lumotlar:
     Kirish oqimida ikkita butun son kiritiladi, sonlar 109dan kam
     Chiquvchi ma'lumotlar:
     Chiqish oqimida berilgan ikki sonni yig'indisini chiqarish kerak bo'ladi
     */
//yechim

//val num = readln().split(' ').map{it.toInt() }
//    println(num[0]+num[1])


    /* 2.Muallif: Sunatullo Hojiyev, Xotira: 16 MB, Vaqt: 1000 ms , Qiyinchiligi: 3 %
    Masala
    Sonlar ustida amallarning eng muximlaridan biri bu - taqqoslashdir. Ushbu
    masalada sizga qo'yilgan talab, ikkita butun sonni taqqoslash kerak bo'ladi
    Kiruvchi ma'lumotlar:
    Kirish oqimida ikkita butun son A va B berilgan bo'ladi, va ularning absolyut qiymati
    2×109
     dan kichik bo'ladi
    Chiquvchi ma'lumotlar:
    Chiqarish oqimida bitta belgi chiqarish kerak. Agar A > B bo'lsa ">", agar A = B bo'lsa
    "=", yoki A < B bo'lganda "<" belgisini.
     */
//yechim

    /*val number = readln().split(' ').map { it.toInt() }
     when {
         number[0] > number[1] -> println(">")
         number[0] < number[1] -> println("<")
         number[0] == number[1] -> println("=")
     }
 */
    /*3
        Muallif: Sunatullo Hojiyev, Xotira: 16 MB, Vaqt: 1000 ms , Qiyinchiligi: 35 %
        Masala
        Ikkita butun son A va B ning yig'indisini hisoblang
        Kiruvchi ma'lumotlar:
        INPUT.TXT kirish faylining alohida qatorlarida ikkita manfiy bo'lmagan butun
        sonlar berilgan, sonlar 10100 dan oshmaydi.
        Chiquvchi ma'lumotlar:
        OUTPUT.TXT chiqish faylining yagona satrida berilgan ikki sonning
                yig'indisini(boshlang'ich nollarsiz) chiqaring.
    */
    // yechim
    // println(Array(2){ readln().toInt()}.let{it[0]+it[1]})
    /*4

     */
    //yechim
    //val number = readln().split(' ').map { it.toInt() }
    //println(number[0] * number[1])
    val year = readln().toInt()
    when {
        year % 400 == 0 -> println("12/09/$year")
        year % 4 == 0 && year % 100 != 0 -> println("13/09/$year")
        year / 10 == 0 -> println("13/09/000$year")
        year / 100 == 0 -> println("13/09/00$year")
        year / 1000 == 0 -> println("13/09/0$year")
        else -> println("13/09/$year ")
    }

}

/*5
Beshta musbat butun son berilgan, ulardan to'rttasini ajratib olinganda umumiy
yig'indisi bo'lishi mumkin bo'lgan minimum qiymat va maksimum qiymatni
aniqlang.
 */
/*  val numbers = readln().split(' ').map { it.toInt() }
    numbers.sorted()
    val minsum = numbers.take(4).sum()
    val maxsum = numbers.takeLast(4).sum()
    print("$minsum $maxsum ")
   */
/*
Sizga butun sonlar to'plami berilgan. To'plamda ta elementdan tashqari barchasini
jufti bor. To'plamdagi yagona jufti bo'lmagan yolg'iz sonni toping.
Masalan: to'plamida yolg'iz son sonidir.
Kiruvchi ma'lumotlar:
INPUT.TXT kirish faylining birinchi satrida bitta butun soni,
to'plam elementlari soni kiritiladi, ikkinchi satrida bo'sh joy bilan ajratilgan holda
 ta butun son, to'plam elementlari kiritiladi. to'plam elementlari qiymati
 oralig'ida
 */
//yechim

/*  val number = readln().toInt()
  val elements = readln().split(" ").map { it.toInt() }
  var uniqueelemnt = 0
  var uniqueNumber = 0
  for (element in elements) {
      uniqueNumber = uniqueNumber xor element
  }
  println(uniqueNumber)
 */
/*
Uchta opa-singil TATU da o‘qishadi. Ular yangi yilga viloyatga o‘z uylariga qaytishdan
oldin onalari uchun sovg‘a olishmoqchi. Ular olmoqchi bo‘lgan sovg‘aning narxi
so‘m. Yo‘l xarajatlaridan tashqari opa-singillarning to‘ng‘ichida so‘m,
o‘rtanchasida so‘m va kichigida so‘m ortiqcha pul bor. Ular onalari uchun
olmoqchi bo‘lgan sovg‘ani ola olishadimi yoki yo‘qligini aniqlang.
Kiruvchi ma'lumotlar:
Birinchi satrda bitta butun son, soni sovg‘aning narxi kiritiladi. Ikkinchi satrda
esa ta butun son, sonlari, mos ravishda opa singillarning yo‘l haqidan
tashqari ortiqcha pullari miqdori kiritiladi.
Chiquvchi ma'lumotlar:
Opa - singillar onalariga sovg‘ani ola olishsa “Yes” aks holda “No” so‘zini chiqaring.
 */
//yechim
/*
val summa = readln().toInt()
val sistersmoney = readln().split(' ').map { it.toInt() }
if (sistersmoney[0] + sistersmoney[1] + sistersmoney[2] >= summa) {
    println("YES")
} else (println("NO"))
*/
/*
Masala n(2≤n≤100)n(
 ta elementdan iborat butun sonli massiv berilgan. Massivning
ikkinchi eng katta elementini aniqlang.
Kiruvchi ma'lumotlar:
Birinchi satrda massiv elementlar soni n natural soni beriladi. Keyingi qatorda ta
nomanfiy butun son, massiv elementlari beriladi. Barcha kiruvchi ma'lumotlar
qiymati 100 dan oshmaydi.
Chiquvchi ma'lumotlar:
Massivning ikkinchi eng katta elementini chiqaring.
 */
//yechim
/* val number = readln().toInt()
 val elements = readln().split(' ').map{it.toInt()}
println( elements.max())
 */


















