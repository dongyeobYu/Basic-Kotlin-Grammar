package section4.lec15_배열_컬렉션

/**
 * Tip. 우선 불변 리스트를 만들고 가변 리스트를 만들자.
 * */
fun list() {

    // 불변타입 <Int> 는 제외 가능 - 타입 추론함
    val numbers = listOf<Int>(100, 200)

    // 가변타입
    val mutableNumbers = mutableListOf<Int>(100, 200)

    val plusArrayList = mutableNumbers.plus(300)

    println(plusArrayList)

    val emptyList = emptyList<Int>()

    println(numbers[0])

    // ForEach
    for (number in numbers) {
        println(number)
    }

    // 전통적인 For loop
    for ((idx, value) in numbers.withIndex()) {
        println("$idx: $value")
    }
}

fun set(){
    val numbers = setOf<Int>(100, 200)
    val mutableNumbers = mutableListOf<Int>(100, 200)
}

fun map() {
    val oldMap = mutableMapOf<Int, String>()

    // put 가능
    oldMap.put(3, "3을 넣었어요")

    // 배열처럼 접근 가능
    oldMap[0] = "Monday"
    oldMap[1] = "Tuesday"

    println(oldMap)

    // 중위 호출 불변 Map
    mapOf(1 to "Monday", 2 to "Tuesday")

    for (key in oldMap.keys) {
        println("$key: $oldMap")
    }

    for ((idx, value) in oldMap.entries) {

    }

}
