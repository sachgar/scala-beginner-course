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