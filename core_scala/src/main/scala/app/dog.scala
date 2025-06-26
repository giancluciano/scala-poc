package app

trait Speakable {
    def speak(): String
}

trait Walkable {
    def walk(): String = "Walking"
}

case class Dog(val name: String) extends Speakable with Walkable {
    def speak(): String = "Bark"
}