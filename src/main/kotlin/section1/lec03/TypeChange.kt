package section1.lec03

/**
 * Long 타입에 Int 타입을 넣으면 에러 발생 !!!
 * */
fun main(){
    val number1: Int? = 5
    val number2: Long = number1?.toLong() ?: 0           // toLong, toInt 처럼 명시적으로 타입을 변경해줘야함


}