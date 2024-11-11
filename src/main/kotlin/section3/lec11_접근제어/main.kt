package section3.lec11_접근제어

class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
){
    var price = _price;
}