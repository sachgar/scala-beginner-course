/* An object is a singleton instance (there can only be one instance of the object)
   To declare and use an object :
*/
object RandomNumber:
    def generateDouble(): Double =
        math.random()
    def generateInt(): Int =
        val number = math.random() * 100
        number.intValue()

val firstNumberAsDouble = RandomNumber.generateDouble()
val secondNumberAsInt = RandomNumber.generateInt()