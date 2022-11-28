package ex

import kotlin.random.Random

fun initIntList(): MutableList<Int>{
    val result = mutableListOf<Int>()
    for (i in 0..100){
        result.add(Random.nextInt(100))
    }

    return result
}