fun main() {
    val list = listOf(9, 2, 5, 3, 1, 5, 3)
    val sortedList = bubbleSort(list)
    println(sortedList)
}

fun bubbleSort(inputList: List<Int>): List<Int> {
    // Создаем изменяемый список из входного списка, чтобы можно было изменять элементы
    val list = inputList.toMutableList()

    // Получаем размер списка
    val n = list.size

    // Внешний цикл, который проходит по всему списку
    for (i in 0 until n - 1) {
        // Внутренний цикл, который проходит по списку до последнего неотсортированного элемента
        for (j in 0 until n - 1 - i) {
            // Сравниваем текущий элемент с следующим
            if (list[j] > list[j + 1]) {
                // Меняем их местами, если текущий элемент больше следующего
                val temp = list[j]
                list[j] = list[j + 1]
                list[j + 1] = temp
            }
        }
    }

    // Возвращаем отсортированный список
    return list
}

//val sortedList =list.sorted()
//println(sortedList )