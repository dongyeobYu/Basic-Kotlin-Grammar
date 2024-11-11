package section1.lec01

fun main(args: Array<String>) {

    val person = Person("이름")

    println(person.name)

}

class Person(val name: String){
}