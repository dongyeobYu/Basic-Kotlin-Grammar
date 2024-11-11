package section3.lec10_상속

interface Swimable {

    // 인터페이스에서 디폴트 값 설정
    val swimAbility: Int
        get() = 3

    fun act() {
        println("Swimable act")
    }
}