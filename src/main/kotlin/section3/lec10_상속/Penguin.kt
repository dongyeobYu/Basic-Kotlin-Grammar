package section3.lec10_상속

/**
 * extends, implements 는 똑같이 : 을 사용
 * */
class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2


    override fun move() {
        println("Moving $species...")
    }

    // 상위 클래스에 접근하는 명령어 super
    override val legCount: Int
        get() = this.wingCount + super.legCount;

    // 커스텀 getter 구현
    override val swimAbility: Int
        get() = 10

    // 자바면 Flyable.super.act() 로 호출
    // 코틀린은 super<타입>.act() 로 호출
    override fun act(){
        super<Swimable>.act()
        super<Flyable>.act()
    }

}