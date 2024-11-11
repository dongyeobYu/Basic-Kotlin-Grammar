package section3.lec14_다양한클래스

/**
 * 같은 패키지에서만 사용가능
 * "봉인된" 이라는 의미
 * */
sealed class HyundaiCar(
    private val name: String,
    private val price: Long
)