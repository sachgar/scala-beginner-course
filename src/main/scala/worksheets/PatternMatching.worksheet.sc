import scala.util.Random

// Random number between 0 (Inclusive) and 10 (exclusive)
val randomInt = Random.nextInt(10)

// Match on the number and return a string
randomInt match
  case 0 => "Zero"
  case 1 => "One"
  case 2 => "Two"
  case 3 => "Three"
  // Catch all case (Like `else` in a if/else statement)
  case _ => "Other"

// Match returns a value
def matchTest(x: Int): String =
  x match
    case 0 => "Zero"
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
    case _ => "Other"

matchTest(randomInt)

def matchOnType(v: AnyVal): AnyVal =
  v match
    case i: Int => i
    case c: Char => c
    case d: Double => d
    case _ => ()

matchOnType(1)
matchOnType('a')
matchOnType(2.0)

// We are creating a sealed trait, this means that all the implementations of this trait
// must be declared in the same file
// This is useful because it allows the compiler to check if we are handling all the cases
sealed trait Animal

case class Dog(name: String, breed: String) extends Animal
case class Cat(nickname: String, isSecretelyPlanningToKillYou: Boolean = true) extends Animal
case class Parrot(surname: String, isTalking: Boolean) extends Animal
case class OtherAnimal(kind: String) extends Animal

def adoptAnimal(animal: Animal): String =
  animal match
    case Dog(name, breed) =>
      s"You got a new dog! Name: $name, Breed: $breed"
    case Cat(nickname, _) =>
      s"You got a new cat! Nickname: $nickname"
    case Parrot(surname, _) =>
      s"You got a new parrot! Surname: $surname"
    case OtherAnimal(kind) =>
      s"You got something else. Kind $kind"

val dog = Dog("Papel", "Border Collie")
val cat = Cat("Nyx", false)
val dangerousCat = Cat("Kit")
val parrot = Parrot("Lucas", true)
val something = OtherAnimal("Mouse")

adoptAnimal(dog)
adoptAnimal(cat)
adoptAnimal(parrot)
adoptAnimal(something)

// Let's create a second pattern matching method with pattern guards
def checkAnimal(animal: Animal): String =
  animal match
    case Cat(_, isSecretelyPlanningToKillYou) if isSecretelyPlanningToKillYou =>
      "This cat is secretely planning to kill you. Be careful!"
    case Parrot(_, isTalking) if isTalking =>
      "This parrot is a talker"
    case other =>
      adoptAnimal(other)

checkAnimal(dog)
checkAnimal(cat)
checkAnimal(dangerousCat)
checkAnimal(parrot)
checkAnimal(something)