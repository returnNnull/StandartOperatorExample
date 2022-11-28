import kotlin.random.Random

fun main(args: Array<String>) {

//    var num = 1
//    while (num <= 100){
//        println(num)
//        num +=5
//    }
//
//    for (i in 1..100){
//        println(i)
//    }
//
//    for (i in 100 downTo 0){
//        println(i)
//    }
//
//    for (i in 100 downTo 0 step 3){
//        println(i)
//    }

    //Инициализация статического массива
    val nums: Array<Any> = arrayOf(1,6,6)
    // Инициализация пустого массива
    val nums2: Array<Int?> = arrayOfNulls(100)

    //Заполнение массива
    for (i in nums2.indices){
        val randomNum = Random.nextInt(200, 5000)
        nums2[i] = randomNum
    }


    //Вывод массива
    for (i in nums2.indices){
        print("${nums2[i]},")
    }

    for (i in nums.indices){
        print("${nums[i]},")
    }

    println(nums2)



}