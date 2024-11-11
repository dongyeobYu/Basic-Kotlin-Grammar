package section3.lec13_중첩클래스

fun main() {

}

class JavaHouse(
    private val address: String,
    private val livingRoom: LivingRoom
){
    // 자바에서 권장하는 중첩클래스
    // 그냥 클래스로 만들기
    class LivingRoom(
        private val area: Double
    )
}