fun main(args: Array<String>) {

    val side1 = readln().toInt()
    val side2 = readln().toInt()
    val side3 = readln().toInt()

    perimeter(side1, side2, side3)
}

private fun perimeter(side1: Int, side2: Int, side3: Int) {
    val isExist = isExist(side1, side2, side3)


    if (isExist) {
        val p1 = calculatePerimeter(side1, side2, side3)
        println(p1)
    } else {
        println("Not exist")
    }
}

private fun calculatePerimeter(side1: Int, side2: Int, side3: Int): Int {
    return  side1 + side2 + side3
}

private fun calculatePerimeterV2(side1: Int, side2: Int, side3: Int) =  side1 + side2 + side3


private fun isExist(side1: Int, side2: Int, side3: Int): Boolean {

    return side1 + side2 > side3 &&
            side2 + side3 > side1 &&
            side3 + side1 > side2

}
