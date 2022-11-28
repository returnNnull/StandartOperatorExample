import ex.initIntList
import kotlin.math.sqrt
import kotlin.random.Random

fun main(args: Array<String>) {
    val list = initIntList()

    val index1 = readln().toInt()
    val index2 = readln().toInt()

    println(listItemSqrt(list, index1))
    println(listDivResult(list, index1, index2))

}

//Дан массив. Составить программу:
//а) расчета квадратного корня из любого элемента массива;
//б) расчета среднего арифметического двух любых элементов массива.

fun listItemSqrt(list: MutableList<Int>, index: Int) = sqrt(list[index].toDouble())
fun listDivResult(list: MutableList<Int>, index1: Int, index2: Int) = (list[index1] + list[index2])/2
