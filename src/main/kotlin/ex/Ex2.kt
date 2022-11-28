package ex

fun main(args: Array<String>) {

    val list = initIntList()
    println("list sum ${list.sum()}")
    println("list multi ${listItemsMulti(list)}")

}
//
//Определить:
//а) сумму всех элементов массива;
//б) произведение всех элементов массива;
//в) сумму квадратов всех элементов массива;
//г) сумму шести первых элементов массива;
//д) сумму элементов массива с k1-го по k2-й (значения k1 и k2 вводятся
//с клавиатуры; k2 > k1);
//е) среднее арифметическое всех элементов массива;
//ж) среднее арифметическое элементов массива с s1-го по s2-й (значения s1
//и s2 вводятся с клавиатуры; s2 > s1).

fun listItemsMulti(list: MutableList<Int>): Int{
    var result = 1
    list.forEach {
        result *= it
    }
    return result
}

fun listItemsPowSum(list: MutableList<Int>): Int{
    val sublist = list.map {
        it * it
    }
    return sublist.sum()
}

fun firstSixListItemsSum(list: MutableList<Int>): Int {
    val subList = list.subList(0, 6)
    return subList.sum()
}
fun listItemsSum(list: MutableList<Int>, from: Int, to: Int): Int {

    var right = to
    if (to >= list.size){
        right = list.size - 1
    }
    val subList = list.subList(from, right)
    return subList.sum()
}

fun listCenter(list: MutableList<Int>): Double {
    return (list.sum() / list.size).toDouble()
}

fun listCenter(list: MutableList<Int>, from: Int, to: Int): Double{
    var right = to
    if (to >= list.size){
        right = list.size - 1
    }
    val subList = list.subList(from, right)
    return listCenter(subList)
}

