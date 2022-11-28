fun main(args: Array<String>) {

    // <, >, <=, >=, ==, !=
    val text = readln()
    if (text.length <= 5){
        println("length valid")
    }

    //////////////////////////////

    val num  = 100
    if (num > 20){
        if (num < 150){
            print("< 150")
        }
        print("> 20")
    }

    /////////////////////////////
    /// Определить знак числа
    val a = readln().toInt()
    if (a > 0){
        println("Positive")
    }
    else {
        if (a == 0){
            println("variable is null")
        }
        else {
            println("Is negative")
        }
    }

    // && - логическое И
    // || - логическое или
    // Вычисление периметра треугольника, с проверкой существования
    val side1 = readln().toInt()
    val side2 = readln().toInt()
    val side3 = readln().toInt()

    if (side1 + side2 > side3 &&
        side2 + side3 > side1 &&
        side3 + side1 > side2){
        println("Perimeter: ${side1 + side2 + side3}")
    }
    else {
        println("Not exist!!!")
    }

    // with ||
    // Нахождение пути по скорости и времени
    val v = readln().toInt()
    val t = readln().toInt()
    if (v < 0 || t < 0){
        println("Введите корректные данные")
    }
    else {
        val s = v * t
        println(s)
    }


    //Пример: Найти большее число
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    if (num1 > num2){
        println("num1 > num2")
    }
    else {
        if (num1 < num2){
            println("num1 < num2")
        }
        else {
            println("num1 = num2")
        }
    }


}