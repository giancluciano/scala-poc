package app

object App {
    def main (args: Array[String]) : Unit = {
        // variables
        val name = "jon"
        val age: Int = 30

        // name = "doe" causes error

        var count = 0
        count += 1

        // functions
        def add(a: Int, b: Int): Int = {
            a + b
        }

        def mult(a:Int, b:Int): Int = a * b


        // multiple parameters
        def add_partial(a:Int)(b:Int) = {
            a + b
        }

        val fivePlus = add_partial(5) _
        val result = fivePlus(2)

        // high order function
        def addAndMult(f1: (Int, Int) => Int, f2: (Int, Int) => Int, a: Int, b: Int): Int = {
            f1(a, b) + f2(a,b)
        }

        val result2 = addAndMult(add, mult, 2, 2)

    }
}