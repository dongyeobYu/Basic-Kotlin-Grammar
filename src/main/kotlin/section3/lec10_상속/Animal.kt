package section3.lec10_상속

abstract class Animal(
    protected val species: String,

    // 상속받은 클래스에서 필드에 접근할려고 하면 open 키워드를 붙혀야함
    protected open val legCount: Int
) {
    abstract fun move()
}