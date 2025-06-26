package app

case class Cicle(val radius: Double) {
    def area(): Double = Circle.PI * radius * radius
}

object Circle {
    val PI: Double = 3.1415
    def apply(radius: Double): Cicle = new Cicle(radius)
}
