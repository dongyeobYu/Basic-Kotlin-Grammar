package section2.lec08

fun main(){
    plus(5)
    plus(10, 10)
    repeat("Hello World", useNewLine = false)       // default parameter 사용, name argument 사용

    printNameAndGender(name = "유동엽", gender = "MALE")

    val arr = arrayOf("A", "B", "C")
    // * => spread 연산자 배열에 있는 요소를 , 찍어줌
    printAll(*arr)

}


// 기본 accessLevel => public
public fun max(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else{
        b
    }

fun max2(a: Int, b: Int): Int = if(a > b) a else b

fun plus(a: Int, b: Int = 5) {
    println(a + b)
}

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (index in 1..num){
        if(useNewLine == true) {
            println(str)
        } else{
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String){
    for(str in strings) {
        println(str)
    }
}