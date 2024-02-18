package Two

import kotlin.random.Random

// Creating a FastFood interface:
interface FastFood {
    val name: String;
    val price: Double;
    val addOn: List<String>;
    val delivery: Boolean;

    fun order()

    fun typeOrder()
    fun addOnPrice(): Int

    fun deliveryPrice(): Int
}

// I'll make an abstract class as parent class to implement the interface:
abstract class Order(override val name: String, override val price: Double, override val addOn: List<String>, override val delivery: Boolean) : FastFood {

    // Creating a method to log out any new order
    override fun order() {
            println("New order: ");
    }

    // Method to calculate the price for the add ons chosen:
    var totalAddOnAmount = 0;
    override fun addOnPrice(): Int {
        for (add in addOn) {
            totalAddOnAmount += 5;
        }

        println("The total add on price is: $totalAddOnAmount kr");
        return totalAddOnAmount
    }

    // Methos to generate a random number as the delivery price if delivery is chosen as true:
    var deliveryPrice = 0
    override fun deliveryPrice(): Int {
        if (delivery) {
            deliveryPrice = (15..35).random()
            println("The delivery price for you order is: $deliveryPrice kr")
        }
        return deliveryPrice
    }

    // Method to make sure the fast food objets kan be printed out as strings:
    override fun toString(): String {
        return "Name: $name, Price: $price, Add on: $addOn, Delivery: $delivery"
        }
    }

