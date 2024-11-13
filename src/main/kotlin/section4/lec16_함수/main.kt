package section4.lec16_함수

/**
 * 확장함수보다 멤버함수가 우선적으로 호출된다.
 * 정적 타입에 따라 호출되는 함수가 달라진다.
 * val str: Train = srt()
 * 정적 타입은 Train
 * */
fun main() {

    val str = "ABC"
    println(str.lastChar())
}


// fun 확장하려는클래스.함수이름(파라미터): 리턴타입 {
//  this 를 이용해 실제 클래스 안에 접근
// }
fun String.lastChar(): Char {
    return this[this.length - 1]
}