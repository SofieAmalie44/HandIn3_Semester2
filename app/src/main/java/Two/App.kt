package Two

import java.util.Objects

class App {
}

fun main() {

    // Greating the fast food objects:
    val orderPizza1: FastFood = Pizza("Pepperoni", 65.0, listOf("Ham", "cheese"), true);

    val orderPizza2: FastFood = Pizza("Margarita", 60.0, listOf("Olives", "Chili", "Salami"), false);

    val orderSandwich: FastFood = Sandwich("Avocado sandwich", 60.0, listOf("Bacon"), true);

    orderSandwich.order()
    orderSandwich.typeOrder()
    orderSandwich.addOnPrice()
    orderSandwich.deliveryPrice()


// Adding the fast food objects to an array:
    val arrayOfOrders: Array<FastFood> = arrayOf(orderPizza1, orderPizza2, orderSandwich)

// Now I will iterate through that array and use some of the methods I have created:
    var fullPriceOfTheOrder = 0;
    for (order in arrayOfOrders) {
        println(order);

        fullPriceOfTheOrder += (order.price + order.addOnPrice() + order.deliveryPrice()).toInt();
        println("The full price of the order order is: $fullPriceOfTheOrder");
    }
}
