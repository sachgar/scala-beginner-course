// How to declare a simple method
def multiplication(x: Int, y: Int): Int = x * y
multiplication(12 ,45)

// It's possible to pass multiple parameter lists to one method (currying)
def division(x: Int, y: Int)(divider: Int) = (x * y) / divider
division(5,10)(2)

// It's also possible to create methods without any parameter
def name: String = System.getProperty("user.name")
println("Hello I am " + name)

// To declare a method with the indented syntax (new feature with scala 3)
def getYourFullName(firstName: String, surname: String) =
    val fullName = firstName + " " + surname
    fullName.toUpperCase()
getYourFullName("Ron", "Baguette")