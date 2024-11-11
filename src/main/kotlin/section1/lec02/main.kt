package section1.lec02

fun main() {

    println(startsWith6(null))
}

// Null 도 가능
fun startsWith1(str: String?):  Boolean {
    if(str == null){
        throw IllegalArgumentException("null 이 들어왔습니다.")
    }

    return str.startsWith("A")
}

fun startsWith2(str: String?): Boolean? {

    return str?.startsWith("A")

//    if(str == null){
//        return null
//    }
//
//    return str.startsWith("A")
}

fun startsWith3(str: String?): Boolean {
    return str?.startsWith("A") ?: false

//    if(str == null){
//        return false
//    }
//
//    return str.startsWith("A")
}

fun startsWith4(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWith5(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("It's null")
}

// Null 일수가없음, 혹시나 Null 일 경우엔 NPE 발생
fun startsWith6(str: String?): Boolean {
    return str!!.startsWith("A")
}