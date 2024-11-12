package section4.lec15_배열_컬렉션

fun main() {
    val arr = arrayOf(100, 200)

    // copy + return 되는것임, 원본에 추가되는것이 X
    val plusArr = arr.plus(300)

    for ((idx, value) in plusArr.withIndex()) {
        println("${idx}, ${value}")
    }

    for (i in plusArr.indices) {
        println("${i}, ${plusArr[i]}")
    }

}