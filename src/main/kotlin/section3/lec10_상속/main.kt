package section3.lec10_상속

/**
 * 1. final : override 를 할 수 없게한다.
 * 2. open : override 를 열어 준다.
 * 3. abstract : override 필수
 * 4. override : 상위 타입을 override 하고 있다.
 * */
fun main() {
    Derived(300)
}

// 상위 클래스엔 꼭 open 을 피해야함
open class Base(
    open val number: Int= 100
){
    // 상위 클래스에선 하위 클래스의 프로퍼티엔 접근하면 안된다.
    // 초기화 되고 값을 할당 받기 전인 0이 출력됨.
    init {
        println("base class")
        println(number)
    }
}


class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("derived number : " + number)
        println("derived class")
    }
}