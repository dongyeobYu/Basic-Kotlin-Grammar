package section1.lec02

/**
 * ?. 으로 사용
 * Null 이 아닌 경우에만 호출
 * str?.length ?: 0 => str 이 null 이 아니면 length 호출 null 이면 0
 * */
fun SafeCall() {

    val str: String? = "ABC"

    // str.length 불가능
    str?.length     // 가능

    println(str?.length)
}