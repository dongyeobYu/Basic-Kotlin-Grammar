package section4.lec18_컬렉션_함수형

/**
 *
 * */

fun main () {

    val fruits = listOf(
        section4.lec17_람다.Fruit("사과", 1_000),
        section4.lec17_람다.Fruit("사과", 1_200),
        section4.lec17_람다.Fruit("사과", 1_200),
        section4.lec17_람다.Fruit("사과", 1_500),
        section4.lec17_람다.Fruit("수박", 10_000),
        section4.lec17_람다.Fruit("수박", 12_000),
        section4.lec17_람다.Fruit("바나나", 3_000),
        section4.lec17_람다.Fruit("바나나", 3_200),
        section4.lec17_람다.Fruit("바나나", 2_500),
    )

    // all: 조건을 모두 만족하면 true, 그렇지 않으면 false => &&
    // 모두 사과면 true 아니면 false
    val isAllApple = fruits.all { fruit -> fruit.name == "사과"}

    // none: 조건을 모두 불만족하면 true, 그렇지 않으면 false => not
    // all 과 반대

    // any: 조건을 하나라도 만족하면 true, 그렇지 않으면 false => ||

    // count : 리스트의 .size() 와 같음

    // sortedBy : 오름차순 정렬, sortedByDescending : 역정렬, distinctBy : 중복 제거
    // distinctBy 를 사용할때 안에 조건식을 넣으면 true, false 각각 하나씩 저장함
    // 사과, 바나나, 수박이 있을때 사과 -> false , 바나나 -> 이미 사과가 false 이므로 제거, 수박 -> true 이므로 요소 저장 => true 인 수박, false 인 사과만 남긴 후 중복제거
    val distinctBy = fruits.distinctBy { it.name == "수박" }.map { fruit -> fruit.name}

    println(distinctBy)

    // first -> 첫번째 값을 가져온다 (null 이면 NPE 발생)
    // firstOrNull -> 첫번째 값 또는 null 을 가져온다
    // last, lastOrNull 도 있음




}