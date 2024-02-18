package Three

fun main() {
//Now create two objects using the class created
    val car1: Vehicle = Race(5, "Mecedees", 3, 205);
    val car2: Vehicle = Race(17, "Ferrari", 5, 207);

    // Using the methods I created:
    car1.changeGear(5);
    car1.speedUp(210);

    car2.changeGear(4);
    car2.applyBrakes(200);

}