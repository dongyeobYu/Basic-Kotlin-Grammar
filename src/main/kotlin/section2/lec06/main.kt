package section2.lec06

fun main() {
    val numbers = arrayOf(1L, 2L, 3L)

    for (n in numbers){
        println(n)
    }

    //
    for (n in 0..2){
        println(numbers[n])
    }

    // 1씩 줄어들기
    for (n in 2 downTo 0) {
        println("down To : " + numbers[n])
    }

    // 2씩 올라가기
    for (n in 0..10 step 2) {
        println(n)
    }
}