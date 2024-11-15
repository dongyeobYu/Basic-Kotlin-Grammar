package section4.lec17_람다


fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000)
    )

    val isApple = {fruit: Fruit -> fruit.name == "사과"}

    filterFruits(fruits, isApple)
}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()

    for(fruit in fruits) {
        if(filter(fruit)) {
            results.add(fruit)
        }
    }

    return results
}
