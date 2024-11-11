package section3.lec09_클래스

fun main() {
    val person = Person("yudongyeob", 27, "MALE")

    val person2 = Person("전다빈", "FEMALE")

    println(person2.age)

    val person3 = Person()
    println(person3.name)

    println(person.getUpperCaseName())

}

/**
 * 주 생성자
 * public class Person constructor(name: String, age: Int) ->
 * class Person(name:String, age: Int) 로 public -> 코틀린은 기본이 public 이므로 생략가능, constructor 도 생략 가능
 * */
class Person(
    val name: String,
    var age: Int = 1,
    val gender: String = "MALE"
){

    /**
     * 클래스 호출 시점에 호출되는 블록
     * */
    init {
        if(age < 0) throw IllegalArgumentException("나이는 ${age} 이하일 수 없습니다.")
    }

    fun getUpperCaseName(): String {
        return name.uppercase()
    }

    // 위 함수와 같음
    val isAdulted2: Boolean
        get() = this.age > 20


    /**
     * 부 생성자
     * 자바에서 this(name, 1); 과 같은 역할
     * */
    constructor(name: String, gender: String): this(name, 0, gender){
        println("부 생성자1")
    }

    constructor(): this("홍길동", 10, "MALE"){
        println("부 생성자2")
    }
}
