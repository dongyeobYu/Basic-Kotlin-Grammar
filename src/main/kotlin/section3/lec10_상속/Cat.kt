package section3.lec10_상속

/**
 * Convention => 상속할땐 : 양옆 한칸씩 띄우기, 변수 타입 지정은 : 오른쪽만 띄우기
 * class 생성 시에 (생성자) 넣고 : 상속받을 클래스(생성자) 로 상속받음
 * */
class Cat(
    species: String,
    legCount: Int
) : Animal(species, legCount) {

    // override 는 필수적으로 붙혀줘야함
    override fun move(){
        println("Moving ${species} Cat, have ${legCount}")
    }
}