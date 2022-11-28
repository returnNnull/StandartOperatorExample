fun main(args: Array<String>) {

    //Инициализация
    val list = mutableListOf<Int>()

    ///Добавление
    list.add(4)
    list.add(10)
    list.add(7)
    list.add(19)
    list.add(12)
    println(list)

//    //Удаления
//    list.removeAt(1)
//    println(list)

    for (i in list.indices) {
        if (i > 10) {
            list.remove(i)
            println(i)
        }
    }


    list.removeIf {
        it > 10
    }


    val subList = list.filter {
        it < 11
    }
    println("sublist: $subList")
    val multiList = subList.map {
        it - 10
    }
    println("sublist after multi: $multiList")


    println(list)

}