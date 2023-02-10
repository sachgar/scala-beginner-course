// Let's define a trait for animal with values and methods
trait Animal:
    val color : String

    def move(): String

    def eat(food: String): String =
        s"Ate $food"

class Dog(val color: String) extends Animal :
    override def move(): String = "Run"

class Cat(val color: String) extends Animal :
    override def move(): String = "Walk"

class Parrot(val color: String) extends Animal :
    override def move(): String = "Fly"

val dog = Dog("Black")
val cat = Cat("White")
val parrot = Parrot("Purple")

dog.eat("Apple")
dog.move()
cat.color
cat.move()
parrot.move()