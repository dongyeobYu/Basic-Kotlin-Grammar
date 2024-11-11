package section1.lec02

/**
 * 엘비스 연산자
 * str.legnth ?: 0 => Null 인 경우에만 호출되는 연산자
 * */
fun Elvis() {
    var str: String? = "ABC"

    str = null
    println(str?.length ?: "It's null")
}