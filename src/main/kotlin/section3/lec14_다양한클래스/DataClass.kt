package section3.lec14_다양한클래스


fun main() {
    val personDto = PersonDto("유동엽", 27)


}

/**
 * data class
 * equals, toString, hashCode 등을 만들어줌
 * */
data class PersonDto(
    val name: String,
    var age: Int
)