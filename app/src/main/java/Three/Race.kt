package Three

// Creating a class that implements the interface Vehicle:
class Race(val number: Int, val type: String, val currentGear: Int, val currentSpeed: Int): Vehicle {

    // Now I'll make the methods that the interface require:
    override fun changeGear(a: Int) {
        if (currentGear < a) {
            println("Gear up to $a");
        }
        if (currentGear > a) {
            println("Gear down to $a");
        }
    }

    override fun speedUp(a: Int) {
        if (currentSpeed < a) {
            println("Speed up to $a");
        }
    }

    override fun applyBrakes(a: Int) {
        if (currentSpeed > a) {
            println("Apply brakes and speed down to $a");
        }
    }
}