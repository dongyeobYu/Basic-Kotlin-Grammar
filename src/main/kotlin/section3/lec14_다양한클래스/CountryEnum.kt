package section3.lec14_다양한클래스

fun handleCountry(countryEnum: CountryEnum) {
    // Enum 클래스의 분기처리는 when 을 사용해서 직관적으로 변경 가능
    when(countryEnum){
        CountryEnum.KOREA -> TODO()
        CountryEnum.AMERICA -> TODO()
    }
}

enum class CountryEnum(
    private val countryCode: String
) {
    KOREA("KO"),
    AMERICA("US")
}