package Two

// Creating the subclass Pizza in order to create a Sandwich object
class Sandwich(override val name: String, override val price: Double, override val addOn: List<String>, override val delivery: Boolean): Order(name, price, addOn, delivery) {

    // Overriding the type order to find out which order has been made
    override fun typeOrder() {
        println("New sandwich order")
        println(mutableListOf(name, price, addOn, delivery));
    }

}