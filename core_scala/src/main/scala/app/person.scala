package app

case class Person(val name: String, val age: Int) {
    def info(): String = s"name: $name, age: $age"
    def this(name: String) = this(name, 0) // secondary constructor
}