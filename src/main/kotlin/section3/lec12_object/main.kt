package section3.lec12_object

fun main() {

    println(Singleton.a)

    Singleton.a += 10

    println(Singleton.a)

    // 익명 함수
    moveSomethings(object : Log {
        override fun log() {
             println("익명 함수")
        }

    })


}

class Person private constructor(
    val name: String,
    var age: Int
) {
    // static, 자바와 다르게 객체로 간주
    companion object Factory : Log {
        // val => 런타임 시 할당 됨
        // const 붙히면 컴파일 시 할당 됨
        private const val MIN_AGE = 1

        // JvmStatic 이 없다면 Person.Factory.newBaby() 로 접근 가능
        @JvmStatic      // => 자바에서 바로 static 처럼 접근 가능
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("Person 객체의 동행 객체")
        }
    }
}


object Singleton {
    var a: Int = 0
}


private fun moveSomethings(log: Log) {
    log.log()
}