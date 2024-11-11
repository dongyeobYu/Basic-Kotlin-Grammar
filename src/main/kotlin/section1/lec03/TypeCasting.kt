package section1.lec03

import section1.lec01.Person

fun main(){

    val person = Person("유동엽")

    val name = person.name

    println("이름 : ${person.name}")
    println("이름 : $name")

    val trimIndent = """
        ABCD
        EFGH
        ${name}
        ${person.name}
    """.trimIndent()

    println(trimIndent)


}

fun printAgeIfPerson(obj: Any?){
    if(obj is Person){              // is => instanceOf     !is => instanceOf not
        val person = obj as? Person                  // as => Java 의 타입 명시 (Person) obj     as? => null 도 ㄱㅊ
        println(person?.name)
    }
}