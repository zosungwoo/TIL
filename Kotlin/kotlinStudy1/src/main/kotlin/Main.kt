package kr.ac.sejong.ds

fun main() {

    val n = readln().toInt()  // 입력
    println(n)

    val (a, b) = readln().split(" ").map { it.toInt() }  // it은 매개변수 하나일 때 자동으로 부여되는 매개변수 이름
    println(a + b)

    val list1 = listOf(1,2,3,4,5)  // 불변 리스트
    list1.filter { it % 2 == 0 }.forEach { println(it) }  // 짝수만 출력

    val list2 = mutableListOf(1, 2, 3)  // 가변 리스트
    list2.add(4)
    list2.forEach { println(it) }

    val map = mutableMapOf("a" to 1, "b" to 2)  // 가변 맵
    map["c"] = 3
    map.forEach { (key, value) -> println("$key: $value") }  // 키-값 쌍 출력

    val max = if (a > b) a else b  // if-else 표현식

    val result = when (a) {  // when 표현식
        1 -> "Mon"
        2 -> "Tue"
        else -> "Other"
    }

    for (num in list1) {
        println(num)
    }

    for (i in 0 until 5) {   // 0,1,2,3,4
        println(i)
    }

    for (i in 5 downTo 1) {  // 5,4,3,2,1
        println(i)
    }

    for (i in 0..10 step 2) {  // 0,2,4,6,8,10
        println(i)
    }
}