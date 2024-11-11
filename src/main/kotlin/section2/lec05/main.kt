package section2.lec05

fun main(){
    validateScoreIsNotNegative(5)
}


/**
 *  Java 랑 다른점
 *  1. void 가 생략됐다.
 *  2. 함수 만들땐 fun 을 사용
 *  3. Exception 발생 시 new 연산자 사용 안함
 *  */
fun validateScoreIsNotNegative(score: Int){
    if(score in 0..100){
        println("${score} is between 0 and 100")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score > 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score > 90) {
        "A"
    } else if(score > 80) {
        "B"
    } else {
        "C"
    }
}

/**
 * 화살표로 분기처리함
 * */
fun getGradeWithSwitch(score: Int): String {
    return when(score / 10){
        9 -> "A"
        8 -> "B"
        else -> "C"
    }
}